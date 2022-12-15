package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.feignclient.ProductClient;
import com.axis.model.Product;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
	
	
	@Autowired
	ProductClient productclient;
	
	@GetMapping("/payNow/{price}")
    public String payNow(@PathVariable String price) {
                return "Payment with " + price + "is successful";

   }
    @GetMapping("/greet")
    public String greet() {
        return "hello";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
    	return productclient.getAllProduct();
    }
}
