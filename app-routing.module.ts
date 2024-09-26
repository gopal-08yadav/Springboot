import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminndashComponent } from './adminndash/adminndash.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';

const routes: Routes = [
  {path:'admin',component:AdminndashComponent},
  {path:'appointmentlist',component:AppointmentComponent},
  {path:'create-appointment',component:CreateAppointmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }