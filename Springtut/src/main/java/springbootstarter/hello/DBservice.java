package springbootstarter.hello;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBservice {

  @Autowired
  private ProductRepository productRepository;
  private TopProductRepository topProductRepository;
  
  public List<products> getAll(){
    List<products> products = new ArrayList<>();
    productRepository.findAll().forEach(products::add);
    return products;
  }
  
  public products getProduct(Integer id){
    return productRepository.findOne(id);
  }
  
  public List<TopProducts> topTen(){
    return topProductRepository.topTen();
  }
}
