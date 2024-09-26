import { Component } from '@angular/core';
import { AppointmentService } from '../appointment.service';
import { Appointment } from '../appointment';
import { Router } from '@angular/router';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrl: './appointment.component.css'
})
export class AppointmentComponent {

  appointments:Appointment[]=[];
  constructor(private appointmentService:AppointmentService,private router:Router){}
  ngOnInit():void{
    this.getAppointments();
  }
  getAppointments(){
    this.appointmentService.getAllAppointment().subscribe(data=>{
      this.appointments=data;
    });
  }
}
