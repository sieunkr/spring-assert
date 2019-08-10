package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public Coffee findCoffeeByName(String name){
        return coffeeRepository.findByName(name);
    }

    public List<Coffee> filterCoffeeAll(List<String> names){
        return coffeeRepository.findByNameList(names);
    }

}
