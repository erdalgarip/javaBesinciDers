package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandRespons;

public interface BrandService  {

	List<GetAllBrandRespons> getAll();
	void add(CreateBrandRequest brandRequest);
	
}
