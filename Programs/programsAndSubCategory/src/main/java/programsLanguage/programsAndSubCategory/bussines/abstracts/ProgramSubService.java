package programsLanguage.programsAndSubCategory.bussines.abstracts;

import java.util.List;

import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramSubRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramSubResponse;

public interface ProgramSubService {
List<GetAllProgramSubResponse>  getAll(int ProgramById);
void add(CreateProgramSubRequest createProgramSubRequest,int ProgramById);
void update(CreateProgramSubRequest createProgramSubRequest, int ProgramSubById, int ProgramById);
void delete(int id);
}
