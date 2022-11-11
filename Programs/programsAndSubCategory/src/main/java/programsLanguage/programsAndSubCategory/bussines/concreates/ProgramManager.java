package programsLanguage.programsAndSubCategory.bussines.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programsLanguage.programsAndSubCategory.bussines.abstracts.ProgramService;
import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramResponse;
import programsLanguage.programsAndSubCategory.dataAccess.abstracts.ProgramRepository;
import programsLanguage.programsAndSubCategory.entities.Program;

@Service
public class ProgramManager implements ProgramService {

	private ProgramRepository programRepository;

	@Autowired
	public ProgramManager(ProgramRepository programRepository) {

		this.programRepository = programRepository;
	}

	@Override
	public List<GetAllProgramResponse> getAll() {

		List<Program> programs = programRepository.findAll();

		List<GetAllProgramResponse> programresponse = new ArrayList<GetAllProgramResponse>();

		for (Program program : programs) {
			GetAllProgramResponse programitem = new GetAllProgramResponse();
			programitem.setId(program.getId());
			programitem.setProgramAdi(program.getProgramAdi());
			programresponse.add(programitem);

		}
		return programresponse;

	}

	@Override
	public void add(CreateProgramRequest createProgramRequest) {
		Program program = new Program();
		program.setProgramAdi(createProgramRequest.getProgramAdi());
		programRepository.save(program);

	}

	@Override
	public void update(CreateProgramRequest programlars , int ById) {
		Program program = new Program();
		program.setId(ById);
		program.setProgramAdi(programlars.getProgramAdi());
		programRepository.save(program);

	}

	@Override
	public void delete(int id) {
		programRepository.deleteById(id);

	}

}
