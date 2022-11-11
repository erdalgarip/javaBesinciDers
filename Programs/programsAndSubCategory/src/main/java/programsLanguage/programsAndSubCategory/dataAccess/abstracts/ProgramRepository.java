package programsLanguage.programsAndSubCategory.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import programsLanguage.programsAndSubCategory.entities.Program;

public interface ProgramRepository extends JpaRepository<Program, Integer> {

}
