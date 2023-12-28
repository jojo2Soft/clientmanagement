package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.Agency;

public interface AgencyRepository extends JpaRepository<Agency, Long> {

}
