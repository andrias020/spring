package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "country")
public class country {
    @Id
    private String name;
    
    @Column
    private Integer population;
    
    @Column
    private String tairiku;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getTairiku() {
		return tairiku;
	}

	public void setTairiku(String tairiku) {
		this.tairiku = tairiku;
	}
      
}

