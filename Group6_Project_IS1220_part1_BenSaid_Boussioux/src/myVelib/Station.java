package myVelib;

import java.util.*;


public class Station extends Observable{
	static int counter=0;
	private int id;
	private String name;
	private StationType type;
	private GPS position;
	private ArrayList<ParkingSlot> parkingSlots;
	private Status status;
	
	public enum Status {full, available, offline};
	public enum StationType {normal, plus}

	
	public Station(String name, StationType type, GPS position, ArrayList<ParkingSlot> parkingSlots, Status status) {
		super();
		counter++;
		this.id=counter;
		this.name = name;
		this.type = type;
		this.position = position;
		this.parkingSlots = parkingSlots;
		this.status = status;
	}

	

	public Station(String name, StationType type, GPS position) {
		super();
		counter++;
		this.id=counter;
		this.name = name;
		this.type = type;
		this.position = position;
		this.parkingSlots = null;
		this.status= Status.available;
				
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public StationType getType() {
		return type;
	}

	public void setType(StationType type) {
		this.type = type;
	}


	public GPS getPosition() {
		return position;
	}


	public void setPosition(GPS position) {
		this.position = position;
	}


	public ArrayList<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}


	public void setParkingSlots(ArrayList<ParkingSlot> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
		this.setChanged();
		this.notifyObservers();

	}


	public int getId() {
		return id;
	}
	

	
}
