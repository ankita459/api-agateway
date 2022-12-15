package com.axis.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.axis.model.Product;


@FeignClient(name="microservice1")
public interface ProductClient {
	
	@GetMapping("/api/v1/prodcts")
	List<Product> getAllProduct();

}
