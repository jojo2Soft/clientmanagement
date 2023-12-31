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
import bj.ifri.projects.clientmanagement.models.Client;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.ClientRepository;

@Controller
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	@GetMapping("/list")
	public String listClients(Model model) {
		model.addAttribute("clients", clientRepository.findAll() );
		return "clients";
	}
	
	//enregistrer un nouveau client dans une agence
	@PostMapping("/add")
	public String addClientt(@ModelAttribute("client") Client client, @PathVariable Long idAgence) {
		
		Optional<Agency> searchAgency = agencyRepository.findById(idAgence);
		client.setAgency(null);
		clientRepository.save(client);

		return "redirect:/clients/list";
	}
	
	// de lister les clients d’une agence
	@SuppressWarnings("unused")
	@GetMapping("/clients-decouverts/:{idAgence}")
	public String getListClientOfAgence(@PathVariable Long idAgence, Model model) {
		Optional<Agency> searchAgence = agencyRepository.findById(idAgence);
		List<Client> clients  = clientRepository.findByAgency(searchAgence);
		model.addAttribute("clients", clients  );
		
		return "listClientOfAgence";
	}
	
	//lister tous les clients qui sont à découvert
	
//	public String getListClientAreInTheOpen(Model model) {
//		
//		model.addAllAttributes("clientAreInTheOpen", clientRepository)
//		
//	}
	
	//rechercher un client par son nom et prénom
	@GetMapping("/search/:{firstname}/:{lastname}")
	public String searchClients(@PathVariable String firtname, @PathVariable String lastname, Model model){
		
		List<Client> clients = clientRepository.findByFirstnameAndLastname(firtname, lastname);
		model.addAttribute("clients", clients  );
		
		return "results";
		
	}
	
	
	
	
	
}
