package datacredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SigninEmailPassword {
	
	@Id
	private String signinEmail;
	private String signinPassword;
	public String getSigninEmail() {
		return signinEmail;
	}
	public void setSigninEmail(String signinEmail) {
		this.signinEmail = signinEmail;
	}
	public String getSigninPassword() {
		return signinPassword;
	}
	public void setSigninPassword(String signinPassword) {
		this.signinPassword = signinPassword;
	}
	

}
