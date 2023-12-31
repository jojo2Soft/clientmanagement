package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.projects.clientmanagement.models.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {

}
