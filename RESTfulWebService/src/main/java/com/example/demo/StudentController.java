package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {

	 private final AtomicLong atomicLong = new AtomicLong();

	    @GetMapping("/student")
	    public Student student( 	
	            @RequestParam(value = "firstname", defaultValue = "Soumya") String  firstname,
	            @RequestParam(value = "lastname", defaultValue = "Ranjan") String lastname) {
	        return new Student(atomicLong.incrementAndGet(), firstname, lastname);
	    }
}
