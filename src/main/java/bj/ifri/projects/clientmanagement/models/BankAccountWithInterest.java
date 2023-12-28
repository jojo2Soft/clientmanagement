package bj.ifri.projects.clientmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "bankAccountWithInterests")
@Getter
@Setter
public class BankAccountWithInterest extends BankAccount {
	private float rate;
	
	@ManyToOne
	private Client client;
	
	public Client getClient() {
		return this.client;
	}
}
