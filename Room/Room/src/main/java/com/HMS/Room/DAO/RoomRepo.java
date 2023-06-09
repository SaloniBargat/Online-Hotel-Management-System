package com.HMS.Room.DAO;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.HMS.Room.Model.Room;

public interface RoomRepo extends MongoRepository<Room , Long> {

	@Query("{roomAvl:true}")
	List<Room> findAvailable();
}
