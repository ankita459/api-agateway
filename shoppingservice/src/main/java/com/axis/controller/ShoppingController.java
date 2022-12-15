package com.axis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {
	
	@Autowired
    private RestTemplate template;

   @GetMapping("/greet")
    public String greet() {
        //String url=" http://localhost:9091/api/shopping/greet";
        return "hello1";
    }

   @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable String price) {
     //String url = "http://localhost:9091/payNow/" + price;
    // String url= "http://localhost:9091/payment-provider/payNow/" + price;
     
               String url = "http://PAYMENT-SERVICE/payment-provider/payNow/" + price;
                return template.getForObject(url, String.class);

   }
}
