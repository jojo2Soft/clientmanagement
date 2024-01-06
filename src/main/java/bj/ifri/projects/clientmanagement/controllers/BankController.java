package bj.ifri.projects.clientmanagement.controllers;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.BankRepository;

@Controller
@RequestMapping(value="/banks")
public class BankController {
	
	@Autowired
	private BankRepository bankRepository;
	
	
	
	@GetMapping("/lists")
	public String listBanks(Model model) {
		
		 List<Bank> banks = bankRepository.findAll();

		// Print only the names to the console
		banks.forEach(bank -> System.out.println(bank.getName()));

	    model.addAttribute("banks", banks);
	    return "banks";
	}
	
	@GetMapping("/{id}")
	public String getBankById(Model model, @PathVariable Long id) {

		model.addAttribute("bank", bankRepository.findById(id));
		return "bank";
	}
	
//	@PostMapping("/add")
//	public String addBank(@ModelAttribute("bank") Bank bank) {
//
//		bankRepository.save(bank);
//
//		return "redirect:/banks/list";
//	}
	
	//a revoir
	



}
