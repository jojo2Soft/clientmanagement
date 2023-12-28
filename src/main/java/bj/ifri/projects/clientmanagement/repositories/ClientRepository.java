package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
