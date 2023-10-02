package com.nology.deliverybackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public List<Product> getAllProducts() {
        return deliveryRepository.findAll();
    }

    public Product getProductById(long id) {
        Optional<Product> product = deliveryRepository.findById(id);

        if (product.isEmpty()) {
            throw new ProductNotFoundException();
        }
        return product.get();
    }

    public Product getRandomProduct() {
        return deliveryRepository.getRandomProduct();
    }
}

//@Service
//public class GreetingsService {
//    @Autowired
//    GreetingsRepository greetingsRepository;  // Adding the dependency
//
//    // CREATE
//    public void addGreeting(Greeting greeting) {
//        greetingsRepository.save(greeting);
//    }
//
//
//    // READ
//
//    public Greeting getGreetingById(long id) {
//        Optional<Greeting> greeting = greetingsRepository.findById(id);
//        // OPTIONAL - A wrapper class -> Avoids null pointer exceptions/checks
//        // Check if there's a value... if not then
//        if (greeting.isEmpty()) {
//            throw new GreetingNotFoundException();
//        }
//        // If there is a value, then you can access it
//        return greeting.get();
//    }
//
//    public Greeting getRandomGreeting() {
//        return greetingsRepository.getRandomGreeting();
//    }
//
//    public List<Long> getGreetingIds() {
//        return greetingsRepository.getDistinctIds();
//    }
//
//    public List<String> getOriginCountries() {
//        return greetingsRepository.getDistinctOriginCountries();
//    }
//
//
//    public List<Greeting> getGreetingsByOriginCountry(String countryName, int limit) {
//        List<Greeting> greetings = greetingsRepository.getGreetingsByOriginCountry(countryName);
//
//        List<Greeting> limitedGreetings = greetings.stream()
//                .limit(limit)
//                .collect(Collectors.toList());
//
//        return limitedGreetings;
//    }
//
//    public List<Greeting> getAllGreetings(int limit) {
//        return greetingsRepository.findAll().stream().limit(limit)
//                .collect(Collectors.toList());
//    }
//
//    // UPDATE
//    public void updateGreeting(Greeting newGreeting, long id) {
////        Optional<Greeting> greeting = greetingsRepository.findById(id);
//
//        if (greetingsRepository.existsById(id)) {
//            throw new GreetingNotFoundException();
//        }
//
//        newGreeting.setId(id); // Ensure greeting has teh correct id
//
//        greetingsRepository.save(newGreeting); // Save can be used to create and update
//    }
//
//    // DELETE
//    @Transactional // Annotation for destructive action on database
//    public void deleteGreetingById(long id) {
//        if (!greetingsRepository.existsById(id)) {
//            throw new GreetingNotFoundException();
//        }
//
//        greetingsRepository.deleteGreetingById(id); // USing the derived method (see GreetingsRepository)
//    }
//}
//
