package datacredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VerifyOtp {
	
	@Id
	private String verifyEmail;
	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	private String verifyOtp;

	public String getVerifyOtp() {
		return verifyOtp;
	}

	public void setVerifyOtp(String verifyOtp) {
		this.verifyOtp = verifyOtp;
	}
	
}
