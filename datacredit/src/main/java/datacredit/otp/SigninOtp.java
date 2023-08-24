package datacredit.otp;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SigninOtp {

	public void main(String mail,String name,String otp)
	{
		String message="Hey "+name+" This is your OTP : "+otp;
		String subject="Confirmation Mail";
		String to=mail;
		String from="19cst121.bijayameher@giet.edu";
		sendMail(message,subject,to,from);
		

	}
	public void sendMail(String message,String subject,String to,String from)
	{
		String host="smtp.gmail.com";
		Properties properties=System.getProperties();
		System.out.println("Properties : "+properties);
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		
		Session session=Session.getInstance(properties,new Authenticator() {
		
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("19cst121.bijayameher@giet.edu","Bijaya@21");
				
			}
		});
		
		MimeMessage m=new MimeMessage(session);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			
			Transport.send(m);
			
			System.out.println("Successfully Sent the message.............");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
