package bj.ifri.projects.clientmanagement.models;

import java.util.List;

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

@Entity(name = "clients")
@Getter
@Setter
public class Client {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String number;
	
	private String firstname;
	
	private String lastname;
	
	private String adress;
	
	private String nameAdvisor;
	
	@ManyToOne
	private  Agency agency;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BankAccount> bankAccounts;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BankAccountWithInterest> bankAccountWithInterests;
	
	// Fonction pour obtenir la liste des comptes bancaires du client
    public List<BankAccount> getListBankAccounts() {
        return this.bankAccounts;
    }
    
    public List<BankAccountWithInterest> getListBankAccountWithInterests() {
        return this.bankAccountWithInterests;
    }
    
    
	
	
	
	
}
