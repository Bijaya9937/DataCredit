package datacredit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import datacredit.dao.CardDetailsDao;
import datacredit.dao.SigninDao;
import datacredit.dao.SignupDao;
import datacredit.model.CardDetails;
import datacredit.model.SigninEmailPassword;
import datacredit.model.SigninEntity;
import datacredit.model.SignupEntity;
import datacredit.model.VerifyOtp;
import datacredit.otp.SigninOtp;

@Controller
public class DatacreditMainController {
	
	@Autowired
	private SignupDao signupdao;
	
	@Autowired
	private SigninDao signindao;
	
	@Autowired
	private CardDetailsDao carddetailsdao;
	
	//####################################### Sign Up #############################################
	
	
	@RequestMapping("/")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping(value="/signupRes", method=RequestMethod.POST)
	public RedirectView signupResult(@ModelAttribute SignupEntity signupentity,HttpServletRequest req)
	{
		System.out.println("Signupentity :"+signupentity);
		
		signupdao.Insert(signupentity);
	
		RedirectView rv=new RedirectView();
		rv.setUrl(req.getContextPath()+"/"+"signinEmail"+"/"+"valid");
		return rv;
		
	}

	//############################################################################################
	
	//############################### Sign In Using Email ########################################
	
	
	@RequestMapping("/signin/{msge}")
	public String signin(@PathVariable("msge") String msge,Model model)
	{
		model.addAttribute("message",msge);
		System.out.println("Msge :"+model.getAttribute("message"));
		return "signin";
	}	
	
	
	//################################################################################################
	
	//############################# OTP Verification #################################################
	
	
	@RequestMapping(value="/otpEmail",method=RequestMethod.POST)
	public RedirectView otpForm(@ModelAttribute SigninEntity signinentity, HttpServletRequest req)
	{
		String otpEmail=signinentity.getSigninEmail();
		SignupEntity toCheckEmail = signupdao.Read(otpEmail);
		String signupEmail = toCheckEmail.getSignupEmail();
		String name = toCheckEmail.getSignupName();
		String toSendOtp = signinentity.getSigninOtp();
		if(signupEmail.equals(otpEmail))
		{
			SigninOtp sOtp=new SigninOtp();
			sOtp.main(otpEmail,name,toSendOtp);
			signindao.Insert(signinentity);
			RedirectView rv=new RedirectView();
			rv.setUrl(req.getContextPath()+"/"+"verifyotp"+"/"+"sentConfirmed"+"/"+otpEmail);
			return rv;
			
		}
		else
		{
			RedirectView rv=new RedirectView();
			rv.setUrl(req.getContextPath() + "/" + "otpEmail");
			return rv;
		}
	}
	
	@RequestMapping("/verifyotp/{msge}/{email}")
	public String verifyOtpForm(@PathVariable("msge") String msge,@PathVariable("email") String email,Model model)
	{
		model.addAttribute("msge",msge);
		model.addAttribute("email",email);
		return "verifyotp";
	}
	@RequestMapping(path="/otpVerify",method=RequestMethod.POST)
	public RedirectView verifyOtp(@ModelAttribute VerifyOtp verifyotp,HttpServletRequest req)
	{
		//String otpToVerify=verifyotp.getVerifyOtp();
		System.out.println("DatacreditComtroller / 116 line present");
		String otpToVerify=verifyotp.getVerifyOtp();
		String emailToRead=verifyotp.getVerifyEmail();
		String otpEmail=emailToRead+".com";
		SigninEntity signinentity= signindao.Read(otpEmail);
		
		System.out.println("OTP to verify : DC :line 121: "+signinentity);
		System.out.println("emailToRead : DC :line 122: "+emailToRead);
		System.out.println("getSigninOtp : DC :line 123: "+signinentity.getSigninOtp());
		if(otpToVerify.equals(signinentity.getSigninOtp()))
		{
			System.out.println("Successfully Completed the Signin process .......");
			RedirectView rv=new RedirectView();
			rv.setUrl(req.getContextPath()+"/"+"cardbenefit"+"/"+emailToRead);
			return rv;
			
		}
		else
		{
			System.out.println("Wrong OTP entered");
			RedirectView rv=new RedirectView();
			rv.setUrl(req.getContextPath()+"/"+"verifyotp");
			return rv;
		}	
		
	}
	@RequestMapping("/verifyotp")
	public String otpVerifyPage()
	{
		return "verifyotp";
	}
	
	
	//#############################################################################################
	
	//################################## Sign In Using Email and Password #########################
	
	@RequestMapping("/signinEmail/{msge}")
	public String signinemailpassword(@PathVariable("msge") String msge,Model model)
	{
		System.out.println("Message :"+msge);
		model.addAttribute("msge",msge);
		return "signinemailpassword";
	}
	
	@RequestMapping(value="/signinEmailPass",method=RequestMethod.POST)
	public RedirectView signinEmail(@ModelAttribute SigninEmailPassword signinemailpassword,HttpServletRequest req)
	{
		
			String email=signinemailpassword.getSigninEmail();
			String password=signinemailpassword.getSigninPassword();
			
			SignupEntity signupentity= signupdao.Read(email);
			
			//String signupEmail = signupentity.getSignupEmail();
			String signupPassword = signupentity.getSignupPassword();
			
			if(password.equals(signupPassword))
			{
				RedirectView rv=new RedirectView();
				rv.setUrl(req.getContextPath()+"/signin"+"/"+"valid");
				return rv;
			}
			else
			{
				RedirectView rv=new RedirectView();
				rv.setUrl(req.getContextPath()+"/signinEmailPass"+"/"+"NotValid");
				return rv;
			}
				
	}
	
	@RequestMapping("/signinEmailPass/{msge}")
	public String wrongPassword(@PathVariable("msge") String msge,Model model)
	{
		model.addAttribute("msge",msge);
		return "signinemailpassword";
	}
	
	//###################################################################################################################
	
	//#################################################### Card Benefit Page ###############################################
	
	@RequestMapping("/cardbenefit/{email}")
	public String cardbenefit(@PathVariable String email,Model model)
	{
		System.out.println("DC: 204 line "+email);
		model.addAttribute("email",email+".com");
		return "cardbenefit";
	}
	
	//###################################################################################################################
	
	//################################################### Reward ########################################################
	
	
	@RequestMapping("/carddetails/{email}")
	public String carddetails(@PathVariable String email,Model model)
	{
		model.addAttribute("email",email+".com");
		return "carddetails";
	}
	
	@RequestMapping(value="/cardinfo", method=RequestMethod.POST)
	public RedirectView cardInfo(@ModelAttribute CardDetails carddetails,Model model,HttpServletRequest req)
	{
		
		System.out.println("DataCreditMainController : 220 line : "+carddetails);
		RedirectView rv= new RedirectView();
		
		carddetailsdao.Insert(carddetails);
		
		String email=carddetails.getCardHolderEmail();
		System.out.println("Email cardInfo :"+email);
		rv.setUrl(req.getContextPath()+"/"+"profileScore"+"/"+email);
		return rv;
	}
	
	//###################################################################################################################
	//################################# ADMIN APPROVE ##################################################################
	
	@RequestMapping("/admin")	
	public String admin(Model model)
	{
		List<CardDetails> cd=new ArrayList<CardDetails>();
		cd=carddetailsdao.ReadAll();
		model.addAttribute("CardDetails",cd);
		System.out.println("DC: 249 card details dao "+carddetailsdao.ReadAll());
		return "adminPanel";
	}

	@RequestMapping("/removed")
	public String remove(@ModelAttribute CardDetails carddetails)
	{
		//carddetailsdao.delete()
		return "admin";
	}
	
	@RequestMapping("/profileScore/{email}")
	public String profileScore(@PathVariable String email,Model model)
	{
		//System.out.println("Email is :"+email);
		model.addAttribute("email",email+".com");
		return "profileScore";
	}
	
}
