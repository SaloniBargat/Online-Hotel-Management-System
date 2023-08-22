import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { AuthenticationComponent } from './authentication/authentication.component';
import { RoomBookingRequestComponent } from './room-booking-request/room-booking-request.component';
import { AppRoutingModule } from './app-routing.module';
import { PaymentComponent } from './payment/payment.component';
import { AccomodationComponent } from './accomodation/accomodation.component';

 
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent, 
    AboutComponent,
    ContactComponent,
    AuthenticationComponent,
    RoomBookingRequestComponent,
    PaymentComponent,
    AccomodationComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
