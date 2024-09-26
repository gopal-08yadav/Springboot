package com.hmsapp.Hospital.Management.System.doclogin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.hmsapp.Hospital.Management.System.doclogin.entity.*;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

}
