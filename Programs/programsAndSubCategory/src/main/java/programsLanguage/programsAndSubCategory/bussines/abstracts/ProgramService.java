package programsLanguage.programsAndSubCategory.bussines.abstracts;

import java.util.List;

import programsLanguage.programsAndSubCategory.bussines.request.CreateProgramRequest;
import programsLanguage.programsAndSubCategory.bussines.response.GetAllProgramResponse;

public interface ProgramService {
List<GetAllProgramResponse> getAll();

void add(CreateProgramRequest createProgramRequest);
void update(CreateProgramRequest createProgramRequest, int ById);
void delete(int id);


}
