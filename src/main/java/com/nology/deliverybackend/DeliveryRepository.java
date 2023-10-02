package com.nology.deliverybackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM products ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Product getRandomProduct();

}
