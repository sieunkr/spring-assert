package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping
    public Coffee findOne(@RequestParam(name = "name") String name){
        return coffeeService.findCoffeeByName(name);
    }

    @GetMapping("/filter")
    public List<Coffee> filterAll(@RequestParam(name = "name") List<String> names){
        return coffeeService.filterCoffeeAll(names);
    }


}
