package datacredit.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import datacredit.model.SigninEntity;

@Component
public class SigninDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void Insert(SigninEntity signinentity)
	{
		System.out.println("SigninDao : Line - 20 :"+signinentity);
		this.hibernatetemplate.save(signinentity);
	}
	public SigninEntity Read(String email)
	{
		SigninEntity se = this.hibernatetemplate.get(SigninEntity.class, email);
		return se;
	}
	
	public HibernateTemplate getHt() {
		return hibernatetemplate;
	}


	public void setHt(HibernateTemplate ht) {
		this.hibernatetemplate = ht;
	}
	
	
	

}
