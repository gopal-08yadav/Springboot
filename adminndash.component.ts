import { Component } from '@angular/core';
import { PatientService } from '../patient.service';
import { Patient } from '../patient';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminndash',
  templateUrl: './adminndash.component.html',
  styleUrl: './adminndash.component.css'
})
export class AdminndashComponent {

  searchText:string="";
  patients:Patient[]=[];
  constructor(private patientService:PatientService,private router:Router){}

  ngOnInit():void{
    this.getPatients();
  }
  getPatients(){
    this.patientService.getPatientList().subscribe(data=>{

      this.patients=data;
    });
  }
  
}
