package com.hmsapp.Hospital.Management.System.doclogin.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmsapp.Hospital.Management.System.doclogin.entity.Appointment;
import com.hmsapp.Hospital.Management.System.doclogin.repository.AppointmentRepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class AppointmentController {

	private AppointmentRepository ar;

	public AppointmentController(AppointmentRepository ar) {
		super();
		this.ar = ar;
	}
	
	@PostMapping("/appointments")
	public Appointment createAppointment(@RequestBody Appointment appoinment) {
		return ar.save(appoinment);
		
	}
	
	@GetMapping("/appointments")
	public List<Appointment>getAllAppointment(){
		return ar.findAll();
		}
	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteAppointment(@PathVariable long id) throws AttributeNotFoundException{
		Appointment appointment = ar.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("Appointment not found with id " + id));
        
        ar.delete(appointment);
        Map<String,Boolean> response = new HashMap<String,Boolean>();
        response.put("Deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
	}
}