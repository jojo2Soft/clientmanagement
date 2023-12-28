package bj.ifri.projects.clientmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.projects.clientmanagement.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
