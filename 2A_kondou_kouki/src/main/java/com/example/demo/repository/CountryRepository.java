package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.country;
public interface CountryRepository<Country> extends JpaRepository<country,String> {
	List<Country> findByTairiku(String tairiku);
	List<Country>  findByTairikuAndNameLike(String tairiku, String name);

}
