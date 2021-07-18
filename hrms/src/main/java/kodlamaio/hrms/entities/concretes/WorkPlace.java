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
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workplaces")
public class WorkPlace {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="workplace_name")
    private String workplaceName;

    @Column(name="workplace_position")
    private String workPlacePosition;

    @Temporal(TemporalType.DATE)
    @Column(name = "first_year")
    private Date firstYear;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_year")
    private Date endYear;
    
    @JsonIgnore
    @OneToMany(mappedBy = "workplaces")
    private List<Resume> resumes;


}
