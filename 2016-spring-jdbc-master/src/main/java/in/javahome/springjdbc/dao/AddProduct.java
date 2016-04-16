package in.javahome.springjdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springjdbc.pojo.Product;

public class AddProduct {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("javahome-jdbc.xml");
		ProductDAO productDAO = context.getBean(ProductDAO.class);
		Product p = new Product();
		p.setProductId(444);
		p.setName("Charger");
		p.setQuantity(1000);
		p.setCost(15000);
		
		productDAO.addProduct(p);
	}
}
