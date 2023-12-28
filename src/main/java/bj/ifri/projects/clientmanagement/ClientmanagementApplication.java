package bj.ifri.projects.clientmanagement;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
import bj.ifri.projects.clientmanagement.repositories.BankRepository;

@SpringBootApplication
public class ClientmanagementApplication {
	@Autowired
	private AgencyRepository agencyRepository;
	
	@Autowired
	private BankRepository bankRepository;
	public static void main(String[] args) {
		SpringApplication.run(ClientmanagementApplication.class, args);
	}
	
	
//	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args->{
			Bank bank = new Bank();
			bank.setAdresseSiege("Cotonou");
			bank.setCapital(5000000);
//			bank.setNumero(9000);
			bankRepository.save(bank);
			
			Agency agency = new Agency();
			agency.setBank(bank);
			agency.setCity("Cotonou");
			agency.setName("Agence de Cotonou");
			agency.setPostalCode("BP 90");
			agency.setNameOfManager("KOKO Joel");
			agency.setNameOfBank(bank.getName());
			agencyRepository.save(agency);
			
			
			
	
	};
	}

}
