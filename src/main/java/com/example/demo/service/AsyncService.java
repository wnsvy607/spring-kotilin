package com.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.testUtil.RandomUtil;

@Service
public class AsyncService {

	private final Logger log = LoggerFactory.getLogger(AsyncService.class);

	@Async
	public CompletableFuture<Integer> asyncLogic() {
		try {
			log.info("started");
			Thread.sleep(1000L);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		log.info("ended");
		return CompletableFuture.supplyAsync(RandomUtil::getPositiveInt);
	}

	@Async
	public Integer syncLogic() {
		try {
			log.info("started");
			Thread.sleep(1000L);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		log.info("ended");
		return RandomUtil.getPositiveInt();
	}

}
