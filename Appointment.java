package com.hmsapp.Hospital.Management.System.doclogin.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private String age;
	
	@Column(name="Symtomps")
	private String symtomps;
	
	@Column(name="Number")
	private String number;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBlood() {
		return symtomps;
	}

	public void setBlood(String symtomps) {
		this.symtomps = symtomps;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Appointment(long id, String name, String age, String symtomps, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.symtomps = symtomps;
		this.number = number;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
