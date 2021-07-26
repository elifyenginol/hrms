package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

public interface SchoolService {
	Result add(School school);
	DataResult<List<School>> getAll();
//	DataResult<List<School>> getByUserId(int userId);
//	DataResult<List<School>> getAllByUserIdOrderByEndYear(int userId);

}
