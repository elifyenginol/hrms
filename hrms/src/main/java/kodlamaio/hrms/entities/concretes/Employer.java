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
@Table(name="employers")

public class Employer {
	@Id
	
	private int userId;
	private String companyName;
	private String phoneNumber;
	private String webSite;
	private boolean verifyBySystem;

}
