package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;


@RestController
@RequestMapping("/api/employee")
public class EmployeesController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();		
	}
	
	@GetMapping("/getByIdentityNumber")
	DataResult<Employee> getByIdentityNumber(@RequestParam String identityNumber)
	{
		return this.employeeService.getByIdentityNumber(identityNumber);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) 
	{
		return this.employeeService.add(employee);
	}
	

	@GetMapping("/getAllByPage")
	DataResult<List<Employee>> getAll(int pageNo,int pageSize){
		return this.employeeService.getAll(pageNo-1, pageSize);
	}

	@GetMapping("getByMail")
	DataResult<Employee> getAllByMail(@RequestParam String mail){
		return this.employeeService.getAllByMail(mail);
	}
}
