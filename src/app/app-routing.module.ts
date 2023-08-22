import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { AccomodationComponent } from './accomodation/accomodation.component';
import { AuthenticationComponent } from './authentication/authentication.component';
import { RoomBookingRequestComponent } from './room-booking-request/room-booking-request.component';
import { PaymentComponent } from './payment/payment.component';


const routes: Routes = [
  
   
  {'path':'','component':HomeComponent},
  {'path':'about','component':AboutComponent},
  {'path':'contact','component':ContactComponent},
  {'path':'accommodation','component':AccomodationComponent},
  {'path':'auth','component':AuthenticationComponent},
  {'path':'room-booking-request','component':RoomBookingRequestComponent},
  {'path':'payment','component':PaymentComponent},

 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }