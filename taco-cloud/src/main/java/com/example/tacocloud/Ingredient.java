package com.example.tacocloud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.domain.Persistable;
//import org.springframework.data.relational.core.mapping.Table;

import java.lang.reflect.Type;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Ingredient  {

    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type  {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
