package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concreates.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {


	
}
