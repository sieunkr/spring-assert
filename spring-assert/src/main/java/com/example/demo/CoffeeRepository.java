package com.example.demo;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CoffeeRepository {

    private Map<String, Coffee> coffeeMap;

    @PostConstruct
    void init(){
        coffeeMap = new HashMap<>();
        coffeeMap.put("latte", new Coffee("latte", 1200));
        coffeeMap.put("mocha", new Coffee("mocha", 1300));

    }

    public Coffee findByName(String name){

        CustomAssert.notNull(name, "Coffee's name is not null.");

        return coffeeMap.get(name);
    }


    public List<Coffee> findByNameList(List<String> nameList){

        CustomAssert.notEmpty(nameList, "At least one nameList required.");

        return coffeeMap.values().stream()
                .filter(coffee -> nameList.contains(coffee.getName()))
                .collect(Collectors.toList());
    }


    public List<Coffee> findRandom(int size){

        CustomAssert.isTrue(size > 0, "Coffee size must be larger than zero");


        //TODO: 구현
        return null;
    }

}
