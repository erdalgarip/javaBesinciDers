package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandRespons;

@RestController
@RequestMapping("api/Brands")
public class BrandsController {

private BrandService brandService;

public BrandsController(BrandService brandService) {

	this.brandService = brandService;
}

@GetMapping("/getAll")

public List<GetAllBrandRespons> getAll() {

	return brandService.getAll();
}

@PostMapping("/add")
public void add(CreateBrandRequest brandRequest) {
	this.brandService.add(brandRequest);
	
}

	
}
