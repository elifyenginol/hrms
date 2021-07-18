package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkPlace;

public interface WorkPlaceService {
	Result add(WorkPlace workPlace);
	DataResult<List<WorkPlace>> getAll();

}
