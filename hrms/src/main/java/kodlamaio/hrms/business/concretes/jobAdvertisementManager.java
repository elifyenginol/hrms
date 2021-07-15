package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.jobAdvertisementDetailDto;

@Service
public class jobAdvertisementManager implements JobAdvertisementService {
	JobAdvertisementDao jobAdvertisementDao;

	public jobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi");
	}

	@Override
	public Result update(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement = jobAdvertisementDao.getById(jobAdvertisementId);
		jobAdvertisement.setActive(false);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult( "Aktiflik durumu güncellendi");
	}

	@Override
	public DataResult<List<jobAdvertisementDetailDto>> getByIsActive(boolean isActive) {
		
		return new SuccessDataResult<List<jobAdvertisementDetailDto>>(this.jobAdvertisementDao.getByIsActive(true), "Aktif tüm iş ilanları listelendi");
	}

	@Override
	public DataResult<List<jobAdvertisementDetailDto>> getByIsActiveWithCompanyName(boolean isActive, String companyName) {
		
		return new SuccessDataResult<List<jobAdvertisementDetailDto>>(this.jobAdvertisementDao.getByIsActiveWithCompanyName(true, companyName), "Firmaya ait tüm aktif iş ilanları listelendi");
	}

	@Override
	public DataResult<List<jobAdvertisementDetailDto>> getByIsActiveWithDateSort(Sort sort) {
		sort=Sort.by(Sort.Direction.DESC, "createDate");
		return new SuccessDataResult<List<jobAdvertisementDetailDto>>(this.jobAdvertisementDao.getByIsActiveWithDateSort(sort), "Aktif tüm iş ilanları tarihe göre listelendi");
	}

	

}
