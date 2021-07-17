package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	List<JobAdvertisement> getByStatusTrue();
	List<JobAdvertisement> getByStatusTrueAndEmployer_Id(int id);	
	List<JobAdvertisement> getByStatusTrueOrderByCreateDateDesc();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto"
			+"(e.companyName,p.jobName,c.cityName,j.numberOfPosition,j.createDate,j.deadline)"
			+"From JobAdvertisement j inner join j.employer e "
			+ " inner join j.jobPosition p  "
			+ "inner join  j.city c ")
	List<JobAdvertisementDetailDto> getJobAdvertisementDetails();
}
