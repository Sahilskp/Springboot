package springbootstarter.hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopProductRepository extends JPARepository<TopProducts, String> {

  @Query("select b.product_name,sum(qtysold) as qty from products a , product_master b where a.productid = b.productid group by b.product_name order by 2 desc limit 5")
  List<TopProducts> topTen();
}
