package bj.ifri.projects.clientmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "employees")
@Getter
@Setter
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String adress;
	
	private float salary;
	
	private String nameBank;
	
	private Long numINSEE;
	
	@ManyToOne()
	private Agency agency;
	
	@ManyToOne()
	private Bank bank;
	
	
	
	
}
