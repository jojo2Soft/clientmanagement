package bj.ifri.projects.clientmanagement.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.projects.clientmanagement.models.Agency;
import bj.ifri.projects.clientmanagement.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	// Méthode pour lister tous les clients d'une agence
    List<Client> findByAgency(Optional<Agency> searchAgent);

    // Méthode pour rechercher les clients par nom et prénom
    List<Client> findByFirstnameAndLastname(String firstname, String lastname);	
	
}
