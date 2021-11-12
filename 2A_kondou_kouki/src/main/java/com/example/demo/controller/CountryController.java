package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.country;
import com.example.demo.repository.CompRepository;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.ShopRepository;
@Controller
public class CountryController {
	@Autowired
    CountryRepository repository;
	
    @RequestMapping(path = "/country", method = RequestMethod.GET)
    public String viewPage(Model model) {
        
    	model.addAttribute("countries",repository.findAll());
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "countrysample";
    }
    @RequestMapping(path = "/country", method = RequestMethod.POST)
    public String addPage(Model model,String name,String tairiku,int population) {
    	country kuni = new country();
    	kuni.setName(name);
    	kuni.setTairiku(tairiku);
    	kuni.setPopulation(population);
    	repository.save(kuni);
    	model.addAttribute("countries",repository.findAll());
        return "countrysample";    	
    }
}