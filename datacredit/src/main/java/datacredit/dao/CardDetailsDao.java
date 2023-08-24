package datacredit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import datacredit.model.CardDetails;

@Component
public class CardDetailsDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void Insert(CardDetails carddetails)
	{
		this.hibernatetemplate.save(carddetails);
	}
	
	public CardDetails Read(String email)
	{
		CardDetails cd=this.hibernatetemplate.get(CardDetails.class, email);
		return cd;
	}
	
	public List<CardDetails> ReadAll()
	{
		List<CardDetails> cardList=this.hibernatetemplate.loadAll(CardDetails.class);
		return cardList;
	}

	

}
