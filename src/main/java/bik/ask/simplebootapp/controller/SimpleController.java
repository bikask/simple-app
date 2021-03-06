package bik.ask.simplebootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/services")
	public ResponseEntity<?> serviceInstancesByApplicationName() {
		return ResponseEntity.ok(discoveryClient.getServices());
	}
}
