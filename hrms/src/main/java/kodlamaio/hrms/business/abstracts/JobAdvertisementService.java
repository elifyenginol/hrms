package kodlamaio.hrms.business.abstracts;



import java.util.List;

import org.springframework.data.domain.Sort;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.jobAdvertisementDetailDto;

public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result update(int jobAdvertisementId);
	DataResult<List<jobAdvertisementDetailDto>> getByIsActive(boolean isActive);
	DataResult<List<jobAdvertisementDetailDto>> getByIsActiveWithCompanyName(boolean isActive,String companyName);
	DataResult<List<jobAdvertisementDetailDto>> getByIsActiveWithDateSort(Sort sort);
	

}
