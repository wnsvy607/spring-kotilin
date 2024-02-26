package com.example.demo.controller;

import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestResponse;
import com.example.demo.service.MainService;

@RestController
public class MainController {

	private final MainService mainService;
	private final Logger log = LoggerFactory.getLogger(MainService.class);

	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	@GetMapping("/test")
	public TestResponse test() throws ExecutionException, InterruptedException {
		TestResponse response = new TestResponse(mainService.logic());
		log.info("result: {}", response.getId());
		return response;
	}

	@GetMapping("/health")
	public TestResponse health() {
		TestResponse response = new TestResponse(mainService.syncLogic());
		log.info("result: {}", response.getId());
		return response;
	}

}
