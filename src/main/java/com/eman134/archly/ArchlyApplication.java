package com.eman134.archly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArchlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchlyApplication.class, args);
	}

	@GetMapping("/question")
	public ResponseEntity<String> question(@RequestParam String question) {
		String answer = "resposta aleatória";
		return ResponseEntity.ok(answer);
	}

	@GetMapping("/")
	public String index() {
		return "Hello guy!";
	}

}
