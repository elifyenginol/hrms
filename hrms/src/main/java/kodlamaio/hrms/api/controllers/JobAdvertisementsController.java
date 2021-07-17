package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/update")
	Result update(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.update(jobAdvertisement);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize)
	{
		return this.jobAdvertisementService.getAll(pageNo-1, pageSize);
	}
	
	@GetMapping("/getByStatusTrue")
	DataResult<List<JobAdvertisement>> getByStatusTrue()
	{
		return this.jobAdvertisementService.getByStatusTrue();
	}
	
	@GetMapping("/getByStatusTrueAndEmployer")
	DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployer_Id(int id){
		return this.jobAdvertisementService.getByStatusTrueAndEmployer_Id(id);
	}
	
	@GetMapping("/getByStatusTrueOrderByCreateDateDesc")
	DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDateDesc(){
		return this.jobAdvertisementService.getByStatusTrueOrderByCreateDateDesc();
	}
	
	@GetMapping("/getJobAdvertisementDetails")
	DataResult<List<JobAdvertisementDetailDto>> getJobAdvertisementDetails(){
	    return this.jobAdvertisementService.getJobAdvertisementDetails();
	}

}
