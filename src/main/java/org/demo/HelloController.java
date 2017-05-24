package org.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger logger = LoggerFactory.getLogger(HelloController.class);
	 @RequestMapping("/api/hello")

	 public String greet() {

		 logger.info("Inside HelloController greet'!!!'");
	  return "Hello from the other side\"!!!\"";

	 }
}
