package bj.ifri.projects.clientmanagement.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bj.ifri.projects.clientmanagement.models.Bank;
import bj.ifri.projects.clientmanagement.models.Client;

@Repository
@EnableJpaRepositories
public interface BankRepository extends JpaRepository<Bank, Long> {

//    // Méthode pour lister tous les clients d'une banque qui sont en découvert
//    @Query("SELECT DISTINCT ba.client FROM BankAccount ba WHERE ba.solde < 0 AND ba.agency.bank = :bank")
//    List<Client> findOverdraftClients(@Param("bank") Optional<Bank> bank);
    
//    @Query("SELECT DISTINCT ba.client FROM BankAccount ba WHERE ba.solde < 0 AND ba.agency.bank = :bank")
//    List<Client> findOverdraftClients(@Param("bank") Optional<Bank> bank);
}
