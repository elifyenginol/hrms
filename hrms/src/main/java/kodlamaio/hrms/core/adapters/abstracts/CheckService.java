package kodlamaio.hrms.core.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Employee;

public interface CheckService {
	boolean CheckIfRealPerson(Employee employee);
}
