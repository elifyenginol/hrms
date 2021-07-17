package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{
	
	//@Id	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="user_id", insertable = false)
	//private int userId;
	
	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@NotBlank
	@Column(name="identity_number")
	private String identityNumber;
		
	@NotNull
	@NotBlank
	@Column(name="date_of_birth")
	private int dateOfBirth;
	
    

	
}
