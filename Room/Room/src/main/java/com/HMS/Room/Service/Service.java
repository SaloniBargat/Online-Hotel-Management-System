package com.HMS.Room.Service;

import java.util.List;

import com.HMS.Room.Model.Room;
import com.HMS.Room.Model.RoomList;
import com.google.common.base.Optional;

public interface Service {

	public Room addRoom(Room room);
	public Optional<Room> getRoom(long parseLong);
	public Room updateRoom(Room room);
	public String deleteRoom(long parseLong);
	public List<Room> getAllRoom();
	public RoomList  getRoomAvl();
	
	
	
	
}
