package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.BankAccountWithInterest;

public interface BankAccountWithInterestRepository extends JpaRepository<BankAccountWithInterest, Long> {

}
