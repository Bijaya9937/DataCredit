package datacredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SigninEntity {
	
	@Id
	private String signinEmail;
	private String signinOtp;
	public String getSigninEmail() {
		return signinEmail;
	}
	public void setSigninEmail(String signinEmail) {
		this.signinEmail = signinEmail;
	}
	public String getSigninOtp() {
		return signinOtp;
	}
	public void setSigninOtp(String signinOtp) {
		this.signinOtp = signinOtp;
	}
	@Override
	public String toString() {
		return "SigninEntity [signinEmail=" + signinEmail + ", signinOtp=" + signinOtp + "]";
	}
	
}
