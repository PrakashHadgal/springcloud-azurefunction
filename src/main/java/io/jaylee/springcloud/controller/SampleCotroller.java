package io.jaylee.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleCotroller {

	@GetMapping
	@RequestMapping("greet")
	public String getString() {
		return "This is Simple Apps";
	}
}
