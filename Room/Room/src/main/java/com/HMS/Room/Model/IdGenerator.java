package com.HMS.Room.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="RoomId")
public class IdGenerator {
	
	@Id
	private String id;
	private int seq;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public IdGenerator(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "IdGenerator [id=" + id + ", seq=" + seq + "]";
	}
	
	

}
