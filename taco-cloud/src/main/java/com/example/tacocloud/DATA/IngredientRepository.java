package com.example.tacocloud.DATA;
import com.example.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);

}
