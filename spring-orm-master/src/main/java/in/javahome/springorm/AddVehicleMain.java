package in.javahome.springorm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springorm.dao.VehicleDAO;
import in.javahome.springorm.entity.Vehicle;

public class AddVehicleMain {
public static void main(String[] args) throws SQLException {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-orm.xml");
	VehicleDAO dao = context.getBean(VehicleDAO.class);
	Vehicle v = new Vehicle();
	v.setName("XUV");
	v.setCost(1600000.0);
	dao.addVechicle(v);
}
}
