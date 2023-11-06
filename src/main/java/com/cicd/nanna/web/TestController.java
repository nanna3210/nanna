package com.cicd.nanna.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/test")
public class TestController {
	
	@GetMapping
	public ResponseEntity< Map<String,  String > > test() {
		Map<String,  String > map = Map.of("testing ", "up and running ");
		return ResponseEntity.ok(map);
	}

}
