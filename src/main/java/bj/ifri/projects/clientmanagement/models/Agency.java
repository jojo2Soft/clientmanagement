package bj.ifri.projects.clientmanagement.models;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "agency")
@Getter
@Setter
public class Agency {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String number;
	
	private String name;
	
	private String city;
	
	private String postalCode;
	
	private String nameOfManager;
	
	@ManyToOne
	private Bank bank;
	
	@JsonIgnore
	@OneToMany(mappedBy = "agency" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Employee> employees;
	
	@JsonIgnore
	@OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Client> clients;
	
	private String nameOfBank;
	
	
	public List<BankAccount> getListBankAccounts() {
        List<BankAccount> bankAccounts = clients.stream()
                .flatMap(client -> client.getBankAccounts().stream())
                .collect(Collectors.toList());
        return bankAccounts;
    }
	
	public List<BankAccountWithInterest> getListBankAccountsWithInterest() {
	    List<BankAccountWithInterest> bankAccountsWithInterest = clients.stream()
	            .flatMap(client -> client.getBankAccountWithInterests().stream())
	            .collect(Collectors.toList());
	    return bankAccountsWithInterest;
	}

	
	public List<Employee> getEmployees(){
		return this.employees;
	}
	
	
	
}
