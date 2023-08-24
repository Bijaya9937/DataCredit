package datacredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardDetails {

	@Id
	private String cardHolderEmail;
	private String cardHolderName;
	private String cardNumber;
	private String cardExpiry;
	private String cardSecurityCode;
	public String getCardHolderEmail() {
		return cardHolderEmail;
	}
	public void setCardHolderEmail(String cardHolderEmail) {
		this.cardHolderEmail = cardHolderEmail;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public String getCardSecurityCode() {
		return cardSecurityCode;
	}
	public void setCardSecurityCode(String cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}
	@Override
	public String toString() {
		return "CardDetails [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cardExpiry="
				+ cardExpiry + ", cardSecurityCode=" + cardSecurityCode + ", cardHolderEmail=" + cardHolderEmail + "]";
	}
	
	
}
