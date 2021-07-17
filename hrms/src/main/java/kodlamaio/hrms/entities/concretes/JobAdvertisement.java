package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements")

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	
	@Column(name="job_description")
	private String jobDescription;

	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="number_of_position")
	private int numberOfPosition; 

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="deadline")
	private Date deadline;
	
	@Column(name="status")
	private boolean status;
	
//	@Column(name="job_position_id")
//	private int jobPositionId;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
//	@Column(name="city_id")
//	private int cityId;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
//	@Column(name="user_id")
//	private int userId;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private Employer employer;
	
	


}
