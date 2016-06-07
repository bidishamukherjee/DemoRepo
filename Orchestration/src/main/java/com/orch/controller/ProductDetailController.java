package com.orch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orch.bean.ProductDetail;
import com.orch.dao.ProductCatalogClient;
import com.orch.service.ProductDetailsService;

@RestController
@RequestMapping("/productdetail")
public class ProductDetailController {

	@Autowired
	private ProductCatalogClient productCatalogClient;
	
	@Autowired
	private ProductDetailsService productDetailsService;

	@RequestMapping(method = RequestMethod.GET)
	public List<ProductDetail> getAllProducts() {
		return productDetailsService.getAllProducts();
	}

	/*@RequestMapping(value = "/search/{searchType}", method = RequestMethod.GET)
	public Iterable<ProductDetail> getSpecificProducts(
		
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDetail add(@RequestBody @Valid ProductDetail productDetail) {
		// return repository.save(productDetail);
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable("id") String id) {
		// repository.delete(id);
	}
*/
}
