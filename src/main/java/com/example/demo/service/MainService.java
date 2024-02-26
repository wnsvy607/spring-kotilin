package com.example.demo.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MainService {

	private final AsyncService asyncService;
	private final Logger log = LoggerFactory.getLogger(MainService.class);

	public MainService(AsyncService asyncService) {
		this.asyncService = asyncService;
	}

	public Long logic() throws ExecutionException, InterruptedException {
		log.info("in");
		CompletableFuture<Integer> res1 = asyncService.asyncLogic();
		CompletableFuture<Integer> res2 = asyncService.asyncLogic();

		return res1.thenCombine(res2, (a, b) -> {
			log.info("1: {}", a);
			log.info("2: {}", b);
			return a.longValue() + b.longValue();
		}).get();
	}

	public Long syncLogic() {
		log.info("in");
		long l = asyncService.syncLogic().longValue();
		Integer integer = asyncService.syncLogic();
		log.info("{}, {}", l, integer);
		return l + integer;
	}

}
