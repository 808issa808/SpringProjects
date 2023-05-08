package com.example.tacocloud.DATA;
import java.util.List;
import java.util.Optional;

import com.example.tacocloud.Ingredient;
import com.example.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Ingredient, String> {
    TacoOrder save(TacoOrder order);
//    List<TacoOrder> findByDeliveryZip(String deliveryZip);

}
