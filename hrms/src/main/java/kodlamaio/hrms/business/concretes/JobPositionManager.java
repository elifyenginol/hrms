package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public DataResult<List<JobPosition>> getAll() {		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data listelendi.");
	}


	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Ürün eklendi");
	}


	@Override
	public DataResult<List<JobPosition>> getAll(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(pageable).getContent());
	}


	@Override
	public DataResult<List<JobPosition>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC,"jobName");
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(sort),"Sıralama başarılı");
	}

}
