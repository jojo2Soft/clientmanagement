package bj.ifri.projects.clientmanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.models.BankAccountWithInterest;
import bj.ifri.projects.clientmanagement.models.Client;

@Repository
public interface BankAccountWithInterestRepository extends JpaRepository<BankAccountWithInterest, Long> {

	//lister tous les clients qui sont à découvert
//	@Query("SELECT DISTINCT bawi.client FROM BankAccountWithInterest bawi WHERE bawi.solde < 0 AND bawi.agency.bank = :bank")
//    List<Client> findOverdraftClients(@Param("bank") Bank bank);
}
