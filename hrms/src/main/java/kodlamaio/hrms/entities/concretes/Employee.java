package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")

public class Employee {
	@Id
	
	private int userId;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int dateOfBirth;

	
}
