package com.nology.deliverybackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
//@CrossOrigin(origins = "http://localhost:5173")
public class DeliveryController {

    @Autowired // Can go above setters, constructors and instance variables (like ArrayList below)
    DeliveryService deliveryService;

    @ExceptionHandler
    public String handleExceptions(ProductNotFoundException exception) {
        return exception.getMessage();
    }

//    List<String> products = new ArrayList<>();
//
//    {
//        products.addAll(List.of("Cheese burger","Hamburger","Veggie burger","Fries","Coke"));
//    }

    // CREATE
//    @PostMapping("/product")
//    public Product createProduct(@RequestBody Product product){
//        // SOMETHING GOES HERE!!
//        return product;
//    }

    // READ

//    @GetMapping("/products")
//    public List<String> getAllProducts(){
//        return products;
//    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return deliveryService.getAllProducts();
    }

//    @GetMapping("/products/{id}")
//    public String getProductById(@PathVariable int id){
//        System.out.println("The ID from the URL is: " + id);
//        if (id >= products.size()){
//            System.out.println("Out of range");
//            return "Sorry this value is out of range";
//        }
//        return products.get(id);
//    }

    @GetMapping("/greeting/{id}")
    public Product getProductById(@PathVariable long id) {

        return deliveryService.getProductById(id);
    }

    @GetMapping("/products/random")
//    public String getRandomProduct() {
//        Random rand = new Random();
//        return products.get(rand.nextInt(products.size()));
//    }
    public Product getRandomProduct() {
        return deliveryService.getRandomProduct();
    }

    // UPDATE

    // DELETE

}

//    @GetMapping("/greetings")
//    public List<String> getGreetings(){
//        return greetings;
//    }
//
//    @GetMapping("/greeting/random")
//    public String getRandomGreeting() {
//        Random rand = new Random();
//        return greetings.get(rand.nextInt(greetings.size())); // nextInt(bound) -> 0-4
//    }
//
//    // PATH VARIABLE -> Get a variable from the URL path
//    @GetMapping("/greeting/{id}") // Curly braces means id will change -> could be 1, 2, 3 etc.
//    public String getGreetingById(@PathVariable int id){
//        System.out.println("The ID from the URL is: " + id);
//        if (id >= greetings.size()){
//            System.out.println("Out of range");
//            return null;
//        }
//        // ID -> Index we want to get
//        return greetings.get(id);
//    }