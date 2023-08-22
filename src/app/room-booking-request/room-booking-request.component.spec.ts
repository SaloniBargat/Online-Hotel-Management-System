import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoomBookingRequestComponent } from './room-booking-request.component';

describe('RoomBookingRequestComponent', () => {
  let component: RoomBookingRequestComponent;
  let fixture: ComponentFixture<RoomBookingRequestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RoomBookingRequestComponent]
    });
    fixture = TestBed.createComponent(RoomBookingRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
