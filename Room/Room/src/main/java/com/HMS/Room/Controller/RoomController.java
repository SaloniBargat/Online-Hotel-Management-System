package com.HMS.Room.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.HMS.Room.Model.Room;
import com.HMS.Room.Model.RoomList;
import com.HMS.Room.Service.Service;
import com.HMS.Room.Service.ServiceImpl;
import com.google.common.base.Optional;


@RestController
public class RoomController {
  @Autowired
  Service service;
  
  public RoomController(ServiceImpl service) {
	  this.service=(Service) service;
  }
  
  @PostMapping("/addRoom")
  public Room addRoom(@RequestBody Room room) {
	  return this.service.addRoom(room);
  }
  
  @GetMapping("/findAllRoom")
	public RoomList getAllRoom() {

		RoomList list = new RoomList();
		list.setAllRoom(this.service.getAllRoom());
		//Room.findAll(roomService.getSequenceNumber(Room.SEQUENCE_NAME));
		return list;

	}

	@GetMapping("/findById/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id) {

		return this.service.getRoom(Long.parseLong(id));
	}

	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return this.service.updateRoom(room);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable("id") String id) {
		return this.service.deleteRoom(Long.parseLong(id));
	}

	@GetMapping("/findRoomAvl")
	public RoomList getRoomAvl() {

		return this.service.getRoomAvl();

	}

}

