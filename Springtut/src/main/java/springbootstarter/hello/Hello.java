package springbootstarter.hello;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
  
  @Autowired
  private DBservice dbService;
  
  @RequestMapping("/hello")
  public String sayHi(){
    return "HI";
    
  }
  
  @RequestMapping("/products")
  public List<products> getProduct() throws ClassNotFoundException, SQLException{
    return dbService.getAll();
  }
  
  @RequestMapping("/products/{id}")
  public products getOneProduct(@PathVariable Integer id){
    return dbService.getProduct(id);
  }
  
  @RequestMapping("/products/topTen")
  public List<TopProducts> topTen(){
    return dbService.topTen();
  }

}
