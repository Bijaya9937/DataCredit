package datacredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignupEntity {
	
	@Id
	private String signupEmail;
	private String signupName;
	private String signupNumber;
	private String signupPassword;
	

	public String getSignupEmail() {
		return signupEmail;
	}
	public void setSignupEmail(String signupEmail) {
		this.signupEmail = signupEmail;
	}
	public String getSignupName() {
		return signupName;
	}
	public void setSignupName(String signupName) {
		this.signupName = signupName;
	}
	public String getSignupNumber() {
		return signupNumber;
	}
	public void setSignupNumber(String signupNumber) {
		this.signupNumber = signupNumber;
	}
	public String getSignupPassword() {
		return signupPassword;
	}
	public void setSignupPassword(String signupPassword) {
		this.signupPassword = signupPassword;
	}
	@Override
	public String toString() {
		return "SignupEntity [signupEmail=" + signupEmail + ", signupName=" + signupName + ", signupNumber="
				+ signupNumber + ", signupPassword=" + signupPassword + "]";
	}
	
	
	
}
