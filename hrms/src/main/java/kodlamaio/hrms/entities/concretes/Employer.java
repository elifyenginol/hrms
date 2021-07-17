package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@EqualsAndHashCode(callSuper = false)
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{
	
	//@Id	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="user_id")
	//private int userId;
	
	@NotNull
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@NotBlank
	@Column(name="phone_number")
	private String phoneNumber;
	
	@NotNull
	@NotBlank
	@Column(name="web_site")
	private String webSite;
	
	@Column(name="verify_by_system")
	private boolean verifyBySystem;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

	
	
}
