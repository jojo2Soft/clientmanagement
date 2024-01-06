package bj.ifri.projects.clientmanagement;

//import org.apache.catalina.core.ApplicationContext;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//import org.springframework.context.annotation.Bean;
//
//import bj.ifri.projects.clientmanagement.models.Agency;
//import bj.ifri.projects.clientmanagement.models.Bank;
//import bj.ifri.projects.clientmanagement.models.BankAccount;
//import bj.ifri.projects.clientmanagement.models.BankAccountWithInterest;
//import bj.ifri.projects.clientmanagement.models.Client;
//import bj.ifri.projects.clientmanagement.models.Employee;
//import bj.ifri.projects.clientmanagement.repositories.AgencyRepository;
//import bj.ifri.projects.clientmanagement.repositories.BankAccountRepository;
//import bj.ifri.projects.clientmanagement.repositories.BankAccountWithInterestRepository;
//import bj.ifri.projects.clientmanagement.repositories.BankRepository;
import bj.ifri.projects.clientmanagement.repositories.ClientRepository;
import bj.ifri.projects.clientmanagement.repositories.EmployeeRepository;



@SpringBootApplication
public class ClientmanagementApplication {
//	@Autowired
//	private AgencyRepository agencyRepository;
//	
//	@Autowired
//	private BankRepository bankRepository;
//	
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	@Autowired
//	private ClientRepository clientRepository;
//	
//	@Autowired
//	private BankAccountRepository bankAccountRepository;
//	
//	@Autowired
//	private BankAccountWithInterestRepository bankAccountWithInterestRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientmanagementApplication.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}

	
//	@Bean
//	public CommandLineRunner commandLineRunner(org.springframework.context.ApplicationContext ctx) {
//		return args->{
//			Bank bank = new Bank();
//			bank.setAdresseSiege("Cotonou");
//			bank.setCapital(5000000);
//			bank.setNumero("09300");
//			bankRepository.save(bank);
//			
//			Agency agency = new Agency();
//			agency.setBank(bank);
//			agency.setCity("Cotonou");
//			agency.setName("Agence de Cotonou");
//			agency.setPostalCode("BP 90");
//			agency.setNameOfManager("KOKO Joel");
//			agency.setNameOfBank(bank.getName());
//			agencyRepository.save(agency);
//			
//			Agency agency2 = new Agency();
//			agency2.setBank(bank);
//			agency2.setCity("Cotonou");
//			agency2.setName("Agence de Cotonou");
//			agency2.setPostalCode("BP 90");
//			agency2.setNameOfManager("KOKO Joel");
//			agency2.setNameOfBank(bank.getName());
//			agencyRepository.save(agency2);
//			
//			
//			//enregistrer les employees
//			
//			Employee employee = new Employee();
//			employee.setAdress("Cotonou");
//			employee.setFirstname("Koel");
//			employee.setLastname("Morel");
//			employee.setNumINSEE((long)9022);
//			employee.setSalary(9050000);
//			employee.setAgency(agency);
//			employee.setBank(bank);
//			employee.setNameBank(bank.getName());
//			employeeRepository.save(employee);
//			
//			Employee employee2 = new Employee();
//			employee2.setAdress("Cotonou");
//			employee2.setFirstname("Koel");
//			employee2.setLastname("Morel");
//			employee2.setNumINSEE((long)9022);
//			employee2.setSalary(9050000);
//			employee2.setAgency(agency);
//			employee2.setBank(bank);
//			employee2.setNameBank(bank.getName());
//			employeeRepository.save(employee2);
//			
//			Client client = new Client();
//			client.setAdress("Cotonou");
//			client.setFirstname("josue");
//			client.setLastname("agboton");
//			client.setNameAdvisor(employee.getFirstname()+ " "+ employee.getLastname());
//			client.setAgency(agency);
//			clientRepository.save(client);
//			
//			BankAccount bankAccount = new BankAccount();
//			bankAccount.setAgencyBank(agency.getName());
//			bankAccount.setClient(client);
//			bankAccount.setSolde(0);
//			bankAccount.setLastnameClient(client.getLastname());
//			bankAccount.setFirstnameClient(client.getFirstname());
//			bankAccountRepository.save(bankAccount);
//			
//			
//			BankAccount bankAccount2 = new BankAccount();
//			bankAccount2.setAgencyBank(agency.getName());
//			bankAccount2.setClient(client);
//			bankAccount2.setSolde(-233);
//			bankAccount2.setLastnameClient(client.getLastname());
//			bankAccount2.setFirstnameClient(client.getFirstname());
//			bankAccountRepository.save(bankAccount2);
//			
//			BankAccountWithInterest bankAccountWithInterest = new BankAccountWithInterest();
//			bankAccountWithInterest.setAgencyBank(agency.getName());
//			bankAccountWithInterest.setClient(client);
//			bankAccountWithInterest.setSolde(233);
//			bankAccountWithInterest.setRate((float) 0.06);
//			bankAccountWithInterest.setLastnameClient(client.getLastname());
//			bankAccountWithInterest.setFirstnameClient(client.getFirstname());
//			bankAccountWithInterestRepository.save(bankAccountWithInterest);
//			
//			
//			
//			//liste des client d'une agence
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//		
//	};
//	
//	}
	
	


}
