import { Component } from '@angular/core';
import { Appointment } from '../appointment';
import { AppointmentService } from '../appointment.service';
import { Router } from '@angular/router'; // Corrected import statement

@Component({
  selector: 'app-create-appointment',
  templateUrl: './create-appointment.component.html',
  styleUrls: ['./create-appointment.component.css'] // Corrected property name to styleUrls
})
export class CreateAppointmentComponent {

  appointment: Appointment = new Appointment();

  constructor(private appointmentService: AppointmentService, private router: Router) { }

  saveAppointment() {
    this.appointmentService.createAppointment(this.appointment).subscribe(data => {
      console.log(data);
      this.goToAppointment(); // Navigate to the appointment list after saving
    }, error => console.log(error)); // Add error handling if needed
  }

  onSubmit() {
    this.saveAppointment();
  }

  goToAppointment() {
    this.router.navigate(['/appointmentlist']);
  }
}
