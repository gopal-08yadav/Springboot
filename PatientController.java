package com.hmsapp.Hospital.Management.System.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmsapp.Hospital.Management.System.Entity.Patient;
import com.hmsapp.Hospital.Management.System.Repository.*;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {

	private PatientRepository pr;

	public PatientController(PatientRepository pr) {
		super();
		this.pr = pr;
	}
	
	@PostMapping("/insert")
	public Patient createPatient(@RequestBody Patient patient) {
		
		return pr.save(patient);
	}
	
	@GetMapping
	public List<Patient>getAllPatient(){
		return pr.findAll();
		}
}
