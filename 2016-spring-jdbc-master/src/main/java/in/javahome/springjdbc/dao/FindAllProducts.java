package in.javahome.springjdbc.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springjdbc.pojo.Product;

public class FindAllProducts {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("javahome-jdbc.xml");
		ProductDAO productDAO = context.getBean(ProductDAO.class);
		List<Product> products = productDAO.findAllProducts();
		
		for (Product p : products) {
			System.out.println(p.getProductId());
			System.out.println(p.getName());
			System.out.println(p.getCost());
			System.out.println(p.getQuantity());
			System.out.println("*****************************");
		}
	}
}
