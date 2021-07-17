package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemUsers")
public class SystemUsersController {
	private SystemUserService systemUserService;

	@Autowired
	public SystemUsersController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}
	
	@GetMapping("/getAll")
	DataResult<List<SystemUser>> getAll()
	{
		return this.systemUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(SystemUser systemUser) {
		return this.systemUserService.add(systemUser);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<SystemUser>> getAll(int pageNo,int pageSize){
		return this.systemUserService.getAll(pageNo-1, pageSize);
	}
}
