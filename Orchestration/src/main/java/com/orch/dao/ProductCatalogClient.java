package com.orch.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.catalogue.entity.Product;
import com.orch.ProductUrl;

@Component
public class ProductCatalogClient {

	@Autowired
	private RestTemplate restTemplate;

	public Iterable<Product> getAllProducts() {
		ResponseEntity<Iterable> responseEntity = restTemplate.exchange(
				ProductUrl.PRODUCT_URL, HttpMethod.GET, null, Iterable.class);
		return responseEntity.getBody();
	}
}
