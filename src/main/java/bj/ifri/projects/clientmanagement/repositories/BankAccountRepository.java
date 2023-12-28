package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.BankAccount;

public interface BankAccountRepository  extends JpaRepository<BankAccount, Long>{

}
