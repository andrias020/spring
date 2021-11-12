package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.comp;
public interface CompRepository<Comp> extends JpaRepository<comp,Integer> {
	List<Comp> findByCompnumber(Integer compnumber);
	List<Comp> findByCompname(String compname);
}
