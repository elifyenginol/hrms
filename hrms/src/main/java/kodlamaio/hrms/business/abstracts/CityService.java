package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {
	Result add(@RequestBody City city);
	DataResult<List<City>> getAll();
	
	DataResult<List<City>> getAllByOrderByCityNameAsc();
}
