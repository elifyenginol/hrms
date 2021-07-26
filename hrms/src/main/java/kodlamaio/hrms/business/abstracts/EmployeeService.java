package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	DataResult<List<Employee>> getAll(int pageNo,int pageSize);
	DataResult<Employee> getByIdentityNumber(String identityNumber);
	Result add(Employee employee);
	DataResult<Employee> getAllByMail(String mail);
	
}
