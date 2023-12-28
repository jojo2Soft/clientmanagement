package bj.ifri.projects.clientmanagement.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "bankAccounts")
@Getter
@Setter
public class BankAccount {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String number;
	
	private float solde;
	
	private LocalDateTime openingDate;
	
	private String firstnameClient;
	
	private String lastnameClient;
	
	private String agencyNumber;
	
	private String agencyBank;
	
	@ManyToOne
	private Client client;
	
	public Client getClient() {
		return this.client;
	}
	
}
