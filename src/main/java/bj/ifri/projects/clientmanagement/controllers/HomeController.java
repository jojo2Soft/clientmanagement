package bj.ifri.projects.clientmanagement.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.BankAccount;
import bj.ifri.projects.clientmanagement.models.BankAccountWithInterest;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.BankAccountRepository;
import bj.ifri.projects.clientmanagement.repositories.BankAccountWithInterestRepository;
import bj.ifri.projects.clientmanagement.repositories.BankRepository;


@Controller
public class HomeController {
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	@Autowired
	private BankAccountWithInterestRepository bankAccountWithInterestRepository;
	
	@GetMapping("")
	public String home(Model model) {
		Long nb_bankAccounts=  bankAccountRepository.count();
		Long nb_bankAccountWithInterest = bankAccountWithInterestRepository.count();
		Long ng_agences= agencyRepository.count();
		
		List<Agency> agences=  this.agencyRepository.findAll();
		// Ajouter les variables au modèle
		model.addAttribute("nbBankAccounts", nb_bankAccounts);
		model.addAttribute("nbBankAccountsWithInterest", nb_bankAccountWithInterest);
		model.addAttribute("nbAgences", ng_agences);
		model.addAttribute("agences", agences);
		
		
	    return "index";
	}
	
	

}
