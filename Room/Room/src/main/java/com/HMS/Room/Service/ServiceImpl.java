package com.HMS.Room.Service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.Room.DAO.RoomRepo;
import com.HMS.Room.Model.Room;
import com.HMS.Room.Model.RoomList;


	@Service
	public class ServiceImpl implements Service {
		
		@Autowired
		RoomRepo roomRepo;

	
	public Room addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomRepo.insert(room);
	}

	public Optional<Room> getRoom(long parseLong){
		// TODO Auto-generated method stub
		return roomRepo.findById(parseLong);
	}
	
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return roomRepo.save(room);
	}
	public String deleteRoom(long parseLong) {
		// TODO Auto-generated method stub
		roomRepo.deleteById(parseLong);
		return "Room Number "+parseLong+" is Deleted";
	}
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return roomRepo.findAll();
	}
	public RoomList getRoomAvl() {
		// TODO Auto-generated method stub
		RoomList list = new RoomList();
		list.setAllRoom(roomRepo.findAvailable()); 
		return list;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
