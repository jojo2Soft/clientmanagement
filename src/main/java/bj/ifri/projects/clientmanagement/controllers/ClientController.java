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
		
		List<BankAccountWithInterest> bankAccountsAccountWithInterests = bankAccountWithInterestRepository.findAll();

		List<Client> clients = new ArrayList<>();
		for (BankAccount bankAccount : bankAccounts) {
			if(bankAccount.getSolde()<0) {
				clients.add(bankAccount.getClient()) ;
			}
			 
		}
		for (BankAccountWithInterest bankAccountsAccountWithInterest : bankAccountsAccountWithInterests) {
			if(bankAccountsAccountWithInterest.getSolde()<0) {
				clients.add(bankAccountsAccountWithInterest.getClient()) ;
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
	
	
//	
	
	
	
	
	
}
