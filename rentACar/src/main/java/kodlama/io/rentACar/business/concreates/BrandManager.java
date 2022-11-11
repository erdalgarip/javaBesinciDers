package kodlama.io.rentACar.business.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandRespons;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concreates.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandRespons> getAll() {
 List<Brand> brands = brandRepository.findAll();
 List<GetAllBrandRespons> brandresponse = new ArrayList<GetAllBrandRespons>();
 
 for (Brand brand : brands) {
	 
	 GetAllBrandRespons responsitem = new GetAllBrandRespons();
	 responsitem.setId(brand.getId());
	 responsitem.setName(brand.getName());
	 brandresponse.add(responsitem);
	 
}
return brandresponse;
		
		
	}

	@Override
	public void add(CreateBrandRequest brandRequest) {
		Brand brand = new Brand();
		brand.setName(brandRequest.getName());
		this.brandRepository.save(brand);
		
		
	}

}
