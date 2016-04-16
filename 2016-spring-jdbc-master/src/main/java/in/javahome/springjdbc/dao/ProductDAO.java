package in.javahome.springjdbc.dao;

import java.io.FileNotFoundException;
import java.security.cert.TrustAnchor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springjdbc.pojo.Product;

@Component
public class ProductDAO {
	@Autowired
	private JdbcTemplate template;
	@Autowired
	private SimpleJdbcCall callable;
  public void addProduct(Product p){
	  String sql = "INSERT INTO PRODUCTS(PRODUCT_ID, PRODUCT_NAME,QUANTITY, COST) "
			  +"VALUES(?,?,?,?)";
	  template.update(sql, p.getProductId(),p.getName(),p.getQuantity(),p.getCost());
  }
  
@Transactional(rollbackFor = { FileNotFoundException.class, SQLException.class },
timeout = 5,readOnly=true)
  public void updateProduct(Product p){
	  String sql = "UPDATE PRODUCTS "
	  		+ "Set PRODUCT_NAME=?,QUANTITY=?, COST=? WHERE PRODUCT_ID=? ";
	  template.update(sql, "Laptop",p.getQuantity(),p.getCost(),111);
//	    int i = 10/0;
	  template.update(sql, "Mobile",p.getQuantity(),p.getCost(),444);
  }
  
  public void deleteProduct(int productId){
	  String sql = "DELETE FROM PRODUCTS WHERE PRODUCT_ID=? ";
	  template.update(sql, productId);
  }
  
  public List<Product> findAllProducts(){
	  String sql = "SELECT * FROM PRODUCTS";
	  
	  List<Product> products = template.query(sql, new ProductMapper());
	  return products;
  }
  
  public Product findByPk(int productId){
	  String sql = "SELECT * FROM PRODUCTS where PRODUCT_ID=?";
	  
	  Product prod = template.queryForObject(sql,new Object[]{productId}, new ProductMapper());
	  return prod;
  }
  
  
  public List<String> getAllProductNames(){
	  String sql = "SELECT PRODUCT_NAME FROM PRODUCTS";
	  return template.query(sql, new ProductNameMapper()); 
	  
  }
  
  public List<Object[]> getAllProductNamesAndIds(){
	  String sql = "SELECT PRODUCT_ID,PRODUCT_NAME FROM PRODUCTS";
	  return template.query(sql, new ProductNameAndIdMapper()); 
	  
  }

	class ProductNameAndIdMapper implements RowMapper<Object[]> {
		public Object[] mapRow(ResultSet rs, int rowNum) throws SQLException {
			Object[] row = new Object[2];
			row[0] = rs.getInt("PRODUCT_ID");
			row[1] = rs.getString("PRODUCT_NAME");
			return row;
		}

	}

	class ProductNameMapper implements RowMapper<String> {
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {

			return rs.getString("PRODUCT_NAME");
		}

	}
  class ProductMapper implements RowMapper<Product>{

			public Product mapRow(ResultSet rs, int arg1) throws SQLException {
				Product p = new Product();
				p.setProductId(rs.getInt("PRODUCT_ID"));
				p.setName(rs.getString("PRODUCT_NAME"));
				p.setCost(rs.getDouble("COST"));
				p.setQuantity(rs.getInt("QUANTITY"));
				return p;
			  
		  }
  }
  public void callProc(int productId){
     callable.setProcedureName("GET_PRODUCT_NAME");
     Map<String, Object> inParams = new HashMap<String, Object>();
     inParams.put("PID", productId);
     Map<String, Object> output = callable.execute(inParams);
     System.out.println("Product Name is "+output.get("pname"));
  }
  
}
