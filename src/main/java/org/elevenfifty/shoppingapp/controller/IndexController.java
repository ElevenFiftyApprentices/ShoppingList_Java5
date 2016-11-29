package org.elevenfifty.shoppingapp.controller;

import org.elevenfifty.shoppingapp.repository.ListsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private ListsRepository listRepo;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("lists", listRepo.findAll());
		return "list";
	}
	
	
	
}
