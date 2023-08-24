package datacredit.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import datacredit.model.SignupEntity;

@Component
public class SignupDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void Insert(SignupEntity signupentity)
	{
		this.hibernatetemplate.save(signupentity);
	}
	
	public SignupEntity Read(String email)
	{
		SignupEntity signupentity =(SignupEntity) this.hibernatetemplate.get(SignupEntity.class, email);
		return signupentity;
	}
	
	public HibernateTemplate getHt() {
		return hibernatetemplate;
	}


	public void setHt(HibernateTemplate ht) {
		this.hibernatetemplate = ht;
	}
	
}
