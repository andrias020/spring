package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.shop;
public interface ShopRepository extends JpaRepository<shop,Integer> {
}
