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

//	@Query("SELECT ba FROM BankAccount ba WHERE ba.solde < 0")
//	List<BankAccount> findAccountsWithNegativeBalance();
	
	
}
