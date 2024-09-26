package com.hmsapp.Hospital.Management.System.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hmsapp.Hospital.Management.System.Entity.*;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
