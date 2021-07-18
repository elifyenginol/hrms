package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "schools")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "school_name")
	private String schoolName;

	@Column(name = "school_department")
	private String schoolDepartment;

	@Column(name = "first_year")
	@Temporal(TemporalType.DATE)
	private Date firstYear;

	@Column(name = "end_year")
	@Temporal(TemporalType.DATE)
	private Date endYear;

	 @JsonIgnore
     @OneToMany(mappedBy = "school")
	 private List<Resume> resumes;
}
