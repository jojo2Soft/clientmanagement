package bj.ifri.projects.clientmanagement.controllers;

import java.util.ArrayList;
import java.util.Iterator;
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

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.models.BankAccount;
import bj.ifri.projects.clientmanagement.models.BankAccountWithInterest;
import bj.ifri.projects.clientmanagement.models.Client;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.BankAccountRepository;
import bj.ifri.projects.clientmanagement.repositories.BankAccountWithInterestRepository;
import bj.ifri.projects.clientmanagement.repositories.BankRepository;
import bj.ifri.projects.clientmanagement.repositories.ClientRepository;

@Controller
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	@Autowired
	private BankAccountWithInterestRepository bankAccountWithInterestRepository;
	
	@GetMapping("/list")
	public String listClients(Model model) {
		model.addAttribute("clients", clientRepository.findAll() );
		return "clients";
	}
	
	@GetMapping("/list/decoucouvert")
	public String listClientsDecouvert(Model model) {
		List<BankAccount> bankAccounts = bankAccountRepository.findAll();
		

		List<Client> clients = new ArrayList<>();
		for (BankAccount bankAccount : bankAccounts) {
			if(bankAccount.getSolde()<0) {
				clients.add(bankAccount.getClient()) ;
			}
			 
		}
		
		model.addAttribute("clients", clients );

		
		return "clients-list-decouvert";
	}
	
	@GetMapping("/add-client-form")
	public String addClientForm(Model model) {
		
		model.addAttribute("agences", agencyRepository.findAll() );
	    model.addAttribute("client", new Client());
		return "clients-add";
	}
	
	@GetMapping("/lists/accounts-banks")
	public String listsBanks(Model model, @PathVariable Long id) {
		
		Optional<Client> client = clientRepository.findById(id);
		
		model.addAttribute("agences", agencyRepository.findAll() );
	    model.addAttribute("acountsbanks",client.get().getBankAccounts() );
		return "accounts-banks-of-client";
	}
	
	//enregistrer un nouveau client dans une agence
	@PostMapping("/add")
	public String addClientt(@ModelAttribute("client") Client client) {
		System.out.println(client.getAgency());
		
		clientRepository.save(client);

		return "redirect:/agences/clients";
	}
	

	
	//rechercher un client par son nom et prénom
	// Dans votre contrôleur
	@PostMapping("/search")
	public String searchClients(@ModelAttribute("searchClient") Client searchClient, Model model) {
	    // Effectuez la recherche en utilisant les valeurs de searchClient
	    List<Client> searchResults = clientRepository.findByFirstnameAndLastname(
	            searchClient.getFirstname(), 
	            searchClient.getLastname()
	    );

	    // Ajoutez les résultats à votre modèle
	    model.addAttribute("clients", searchResults);

	    // Renvoyez la vue qui affiche les résultats
	    return "search-results";
	}

	
	
//	
	
	
	
	
	
}
