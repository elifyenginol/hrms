package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.jobAdvertisementDetailDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	@Query("Select new kodlamaio.hrms.entities.dtos.jobAdvertisementDto(e.companyName,j.jobName,a.needEmployeeNumber,a.createDate,a.lastAplyDate)")
	List<jobAdvertisementDetailDto> getByIsActive(boolean isActive);
	
	@Query("Select new kodlamaio.hrms.entities.dtos.jobAdvertisementDto(e.companyName,j.jobName,a.needEmployeeNumber,a.createDate,a.lastAplyDate)")
	List<jobAdvertisementDetailDto> geyByIsActiveWithDate();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.jobAdvertisementDto(e.companyName,j.jobName,a.needEmployeeNumber,a.createDate,a.lastAplyDate)")
	List<jobAdvertisementDetailDto> getByIsActiveWithCompanyName(boolean isActive,String companyName);
	
	@Query("Select new kodlamaio.hrms.entities.dtos.jobAdvertisementDto(e.companyName,j.jobName,a.needEmployeeNumber,a.createDate,a.lastAplyDate)")
	List<jobAdvertisementDetailDto> getByIsActiveWithDateSort(Sort sort);
	
  
}
