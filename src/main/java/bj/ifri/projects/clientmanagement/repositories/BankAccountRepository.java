package bj.ifri.projects.clientmanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.models.BankAccount;
import bj.ifri.projects.clientmanagement.models.Client;
@Repository
public interface BankAccountRepository  extends JpaRepository<BankAccount, Long>{
	//lister tous les clients qui sont à découvert
//		@Query("SELECT DISTINCT bank.client FROM BankAccount bank WHERE bank.solde < 0 AND bank.agency.bank = :bank")
//	    List<Client> findOverdraftClients(@Param("bank") Bank bank);
}
