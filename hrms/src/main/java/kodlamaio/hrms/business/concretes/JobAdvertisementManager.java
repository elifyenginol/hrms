package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İlan eklendi");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İlan güncellendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByStatusTrue(), "Aktif iş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployer_Id(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByStatusTrueAndEmployer_Id(id), "Firmaya ait ilanlar listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDateDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByStatusTrueOrderByCreateDateDesc(), "Aktif iş ilanları tarihe göre listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobAdvertisementDetailDto>> getJobAdvertisementDetails() {
		return new SuccessDataResult<List<JobAdvertisementDetailDto>>(this.jobAdvertisementDao.getJobAdvertisementDetails());
	}



}
