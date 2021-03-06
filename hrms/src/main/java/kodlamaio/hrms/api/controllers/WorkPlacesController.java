package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkPlaceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkPlace;

@RestController
@RequestMapping("/api/workPlaces")
public class WorkPlacesController {
	private WorkPlaceService workPlaceService;

	@Autowired
	public WorkPlacesController(WorkPlaceService workPlaceService) {
		super();
		this.workPlaceService = workPlaceService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody WorkPlace workPlace) {
		return this.workPlaceService.add(workPlace);
	}
	
	@GetMapping("/getAll")
	DataResult<List<WorkPlace>> getAll(){
		return this.workPlaceService.getAll();
	}

}
