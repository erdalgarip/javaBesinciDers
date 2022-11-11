package programsLanguage.programsAndSubCategory.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import programsLanguage.programsAndSubCategory.entities.ProgramSubCategory;

public interface ProgramSubRepository extends JpaRepository<ProgramSubCategory, Integer> {

}
