package com.saloni.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saloni.hotel.model.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {
	
	
	public Room findByRoomName(String roomName);
	
	public List<Room> findByRoomType(String roomType);
	
	
	

}
