package com.example.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import com.example.springboot.Test;

@RestController
public class TestController {
	@PostMapping(value = "/test", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Test> test(@RequestBody Test guido) {
		return ResponseEntity.ok().body(guido);
	}
}
