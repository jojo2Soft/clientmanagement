package bj.ifri.projects.clientmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.hibernate.engine.internal.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.Client;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.BankRepository;
import bj.ifri.projects.clientmanagement.repositories.ClientRepository;

@Controller
@RequestMapping("/agences")
public class AgenceController {
	@Autowired
	private AgencyRepository agencyRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private BankRepository bankRepository;
	
	@GetMapping("/list")
	public String getListAgences(Model model) {
	   
	    model.addAttribute("agences", agencyRepository.findAll());
		
		return "agences-list";
	}
	@GetMapping("/add-client-form")
	public String addAgenceForm(Model model) {
		
		model.addAttribute("bank", bankRepository.findAll() );
	    model.addAttribute("agency", new Agency());
		return "agences-add";
	}
	
	//enregistrer un nouveau client dans une agence
	@PostMapping("/add")
	public String addAgence(@ModelAttribute("agency") Agency agency) {
		
		agencyRepository.save(agency);

		return "redirect:/agences/list";
	}
	
	// de lister les clients d’une agence
	@GetMapping("/{idAgence}/clients")
	public String getListClientOfAgence(@PathVariable Long idAgence, Model model) {
	    Optional<Agency> searchAgence = agencyRepository.findById(idAgence);

	        List<Client> clients = clientRepository.findByAgency(searchAgence.get());
	        model.addAttribute("clients", clients);
	        model.addAttribute("agency", searchAgence  );
	        return "clients-list-of-agences";
	}

	
	@GetMapping("/clients")
	public String getListClientOfAgences(Model model) {
		List<Client> clients  = clientRepository.findAll();
		model.addAttribute("clients", clients  );
		model.addAttribute("agences", agencyRepository.findAll());
		
		return "clients-list";
	}

}
