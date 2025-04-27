package com.fitness.activityservice;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;

@SpringBootApplication
@Slf4j
public class ActivityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityServiceApplication.class, args);
		log.info("Hello");
	}

}
