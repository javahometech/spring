package in.javahome.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springorm.entity.Vehicle;

@Component
public class VehicleDAO {
	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public void addVechicle(Vehicle v){
		template.save(v);
	}
}
