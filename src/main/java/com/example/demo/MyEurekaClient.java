/**
 * 
 */
package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author berina
 *
 */
@RestController
public class MyEurekaClient {
	
	@Autowired
	private DiscoveryClient dc;
	
	@GetMapping("/")
	public List<String> getServiceInstances(){
		return this.dc.getServices();
	}

}
