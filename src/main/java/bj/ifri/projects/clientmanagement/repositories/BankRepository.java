package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.Bank;

public interface BankRepository  extends JpaRepository<Bank, Long>{

}
