package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;


public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize);
	DataResult<List<JobAdvertisement>> getByStatusTrue();
	DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployer_Id(int id);	
	DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDateDesc();
	
	DataResult<List<JobAdvertisementDetailDto>> getJobAdvertisementDetails();
	


}
