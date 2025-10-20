package com.gb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gb.entity.EmailRequest;
import com.gb.service.EmailGeneratorService;



@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins ="*")
public class EmailGeneratorController {

	@Autowired
	private EmailGeneratorService emailGeneratorService;
	
	@PostMapping("/generate")
	public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
		String response = emailGeneratorService.genearateEmailReply(emailRequest);
		return ResponseEntity.ok(response);
	}
}
