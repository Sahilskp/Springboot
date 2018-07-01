package springbootstarter.hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class products {

  @Id
  @Column(name = "id")
  private Integer id;
  
  @Column(name = "productid")
  private String productId;
  
  @Column(name = "qtysold")
  private Long qtysold;
  
  @Column(name = "country")
  private String country;
  
  @Column(name = "eventtime")
  private String eventtime;
  
  @Column(name = "product_name")
  private String name;
  
  
  protected products(){}
  
  public products(String productId, Long qtysold, String country, String eventtime, String name) {
    super();
    this.productId = productId;
    this.qtysold = qtysold;
    this.country = country;
    this.eventtime = eventtime;
    this.name = name;
  }
  
  
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }
  public Long getQtysold() {
    return qtysold;
  }
  
  public int getId(){
    return id;
  }
  
  public String getName(){
    return name;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setQtysold(Long qtysold) {
    this.qtysold = qtysold;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public String getEventtime() {
    return eventtime;
  }
  public void setEventtime(String eventtime) {
    this.eventtime = eventtime;
  }
  
  
}
