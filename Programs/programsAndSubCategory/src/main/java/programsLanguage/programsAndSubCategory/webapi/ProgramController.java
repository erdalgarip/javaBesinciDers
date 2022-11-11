package programsLanguage.programsAndSubCategory.webapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programsLanguage.programsAndSubCategory.bussines.abstracts.ProgramService;
import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramResponse;


@RestController
@RequestMapping("api/program")
public class ProgramController {

private ProgramService programService;


public ProgramController(ProgramService programService) {
	this.programService = programService;
}


@GetMapping("/getall")
public List<GetAllProgramResponse> getAll() {
	
	return programService.getAll();
	
}


@PostMapping("/add")
public void add(CreateProgramRequest createProgramRequest) {
this.programService.add(createProgramRequest);
}

@PutMapping("/update")
public void update(CreateProgramRequest createProgramRequest, int ById) {
	this.programService.update(createProgramRequest,ById);
}

@DeleteMapping("/delete")
public void delete(int id) {
	this.programService.delete(id);
	
}

	

}
