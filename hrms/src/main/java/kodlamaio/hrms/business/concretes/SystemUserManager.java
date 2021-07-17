package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrms.entities.concretes.SystemUser;


@Service
public class SystemUserManager implements SystemUserService {

	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}
	@Override
	public DataResult<List<SystemUser>> getAll() {		
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(),"Data Listelendi");
	}
	@Override
	public Result add(SystemUser systemUser) {
		this.systemUserDao.save(systemUser);
		return new SuccessResult("Sistem yetkilisi eklendi");
	}
	@Override
	public DataResult<List<SystemUser>> getAll(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(pageable).getContent());
	}

}
