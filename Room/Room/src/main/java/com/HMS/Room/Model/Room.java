package com.HMS.Room.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="Rooms")
public class Room {
	
	@Id
	private int Id;
	private Long Charges;
	private String Type;
	private boolean Availability;
	private Object sequenceNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Long getCharges() {
		return Charges;
	}
	public void setCharges(Long charges) {
		Charges = charges;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public boolean isAvailability() {
		return Availability;
	}
	public void setAvailability(boolean availability) {
		Availability = availability;
	}
	public Object getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(Object sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int id, Long charges, String type, boolean availability, Object sequenceNumber) {
		super();
		Id = id;
		Charges = charges;
		Type = type;
		Availability = availability;
		this.sequenceNumber = sequenceNumber;
	}
	@Override
	public String toString() {
		return "Room [Id=" + Id + ", Charges=" + Charges + ", Type=" + Type + ", Availability=" + Availability
				+ ", sequenceNumber=" + sequenceNumber + "]";
	}
	
	

}
