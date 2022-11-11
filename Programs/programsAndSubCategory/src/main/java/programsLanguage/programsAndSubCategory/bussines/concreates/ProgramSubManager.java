package programsLanguage.programsAndSubCategory.bussines.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programsLanguage.programsAndSubCategory.bussines.abstracts.ProgramSubService;
import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramSubRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramSubResponse;
import programsLanguage.programsAndSubCategory.dataAccess.abstracts.ProgramSubRepository;
import programsLanguage.programsAndSubCategory.entities.ProgramSubCategory;

@Service
public class ProgramSubManager implements ProgramSubService {

	private ProgramSubRepository programSubRepository;

	@Autowired
	public ProgramSubManager(ProgramSubRepository programSubRepository) {

		this.programSubRepository = programSubRepository;
	}

	@Override
	public List<GetAllProgramSubResponse> getAll(int ProgramById) {

		List<ProgramSubCategory> programSubCategories = programSubRepository.findAll();
		List<GetAllProgramSubResponse> allProgramSubResponses = new ArrayList<GetAllProgramSubResponse>();

		for (ProgramSubCategory programSubCategory : programSubCategories) {
			if(programSubCategory.getProgramId()==ProgramById) {
			GetAllProgramSubResponse programsubItem = new GetAllProgramSubResponse();
			programsubItem.setId(programSubCategory.getId());
			programsubItem.setProgramId(programSubCategory.getProgramId());
			programsubItem.setName(programSubCategory.getName());
			allProgramSubResponses.add(programsubItem);
			}
		}
		return allProgramSubResponses;

	}

	@Override
	public void add(CreateProgramSubRequest createProgramSubRequest, int ProgramSubById) {

		ProgramSubCategory programaltkategori = new ProgramSubCategory();
		programaltkategori.setProgramId(ProgramSubById);
		programaltkategori.setName(createProgramSubRequest.getName());
		programSubRepository.save(programaltkategori);

	}

	@Override
	public void update(CreateProgramSubRequest createProgramSubRequest, int SubProgramById ,  int ProgramSubById ) {

		ProgramSubCategory programaltkategori = new ProgramSubCategory();
		programaltkategori.setId(SubProgramById);
		programaltkategori.setProgramId(ProgramSubById);
		programaltkategori.setName(createProgramSubRequest.getName());
		programSubRepository.save(programaltkategori);

	}

	@Override
	public void delete(int id) {

		programSubRepository.deleteById(id);

	}

}
