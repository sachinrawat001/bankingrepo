package com.banking1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking1.entity.Employee;
import com.banking1.service.BankingServiceInterface;

@RestController
@RequestMapping("/api/v1/employees")
public class BankingController {
	
	@Autowired
	private BankingServiceInterface bService;

//	@GetMapping("allEmployee")
	@GetMapping
	public List<Employee> displayAllRecord() {
		return bService.getAllEmployeeRecordService(); 
	}
	
//	@PostMapping("createProfile")
	@PostMapping
	public String createRecord(@RequestBody Employee emp) {
		return bService.createProfileService(emp);
	}
	
//	@PutMapping("editProfile/{uid}")
	@PutMapping("/{uid}")
	public String editRecord(@PathVariable("uid") String email,@RequestBody Employee emp) {
		
		return bService.editRecordService(emp);
	}
	
//	@PatchMapping("partialEditProfile") 
	@PatchMapping
	public String partialEditRecord() {
		return "1 am patch mapping";
	}
	
//	@DeleteMapping("deleteProfile/{uid}")
	@DeleteMapping("/{uid}")
	public String deleteRecord(@PathVariable("uid") String email) {
		return bService.deleteRecordService(email);
	}
}

















