package com.hmsapp.Hospital.Management.System.doclogin.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hmsapp.Hospital.Management.System.doclogin.entity.Medicine;
import com.hmsapp.Hospital.Management.System.doclogin.repository.MedicineRepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v3")
public class MedicineController {

	private MedicineRepository mr;

	public MedicineController(MedicineRepository mr) {
		super();
		this.mr = mr;
	}
	
	@PostMapping("/insert")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return mr.save(medicine);
	}
	
	@GetMapping
	public List<Medicine>getAllMedicine(){
		return mr.findAll();
		}
}
