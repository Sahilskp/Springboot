package springbootstarter.hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_master")
public class ProductMaster {

  @Id
  @Column(name = "productId")
  private String productId;
  
  @Column(name = "product_name")
  private String name;

  protected ProductMaster(){}
  
  public ProductMaster(String productId, String name) {
    super();
    this.productId = productId;
    this.name = name;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
