package programsLanguage.programsAndSubCategory.webapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programsLanguage.programsAndSubCategory.bussines.abstracts.ProgramSubService;
import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramSubRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramSubResponse;

@RestController
@RequestMapping("api/altprogram")
public class ProgramSubController {

private ProgramSubService programSubService;

public ProgramSubController(ProgramSubService programSubService) {
	this.programSubService = programSubService;
}

@GetMapping("/getall")
private List<GetAllProgramSubResponse> getAll(int ProgramById) {
	return programSubService.getAll(ProgramById);
}

@PostMapping("/add")
public void add(CreateProgramSubRequest createProgramSubRequest,int ProgramById) {
this.programSubService.add(createProgramSubRequest,ProgramById);
}


@PutMapping("/update")
private void update(CreateProgramSubRequest createProgramSubRequest , int ProgramSubById ,int ProgramById) {
	this.programSubService.update(createProgramSubRequest,ProgramSubById,ProgramById);
	
}


@DeleteMapping("/delete")
public void delete(int id) {
	this.programSubService.delete(id);
	
}


}
