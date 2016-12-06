package io.pivotal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableAsync
public class DistTracingApp3Application {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

	    @Autowired
	    RestTemplate restTemplate;
	   
	    @RequestMapping(path ="/demostart3")
	    public String demostart3() throws InterruptedException{
			log.debug("starting demo from distTracingApp 3");
	        Thread.sleep(1000);
	        return "demostart3";
	    }
	public static void main(String[] args) {
		SpringApplication.run(DistTracingApp3Application.class, args);
	}
}
