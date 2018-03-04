package myVelib;

import myVelib.Station.StationType;

public class ParkingSlot {
	
	private enum Status {free, broken, occupied};
	
	static int counter = 0;
	private int id;
	private Station station;
	private Bicycle bicycle;
	private Status status;

	
	public ParkingSlot(Station station, myVelib.ParkingSlot.Status status) {
		super();
		counter++;
		this.id=counter;
		this.station = station;
		this.bicycle = null;
		this.status = Status.free;
	}	
	
	
	public void becomesFree(){
		this.status = Status.free;
	}
	
	public void becomesBroken() {
		this.status = Status.broken;
	}
	

	public void becomesOccupied(Bicycle bicycle) {
		this.status = Status.occupied;
		this.bicycle = bicycle;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Station getStation() {
		return station;
	}


	public void setStation(Station station) {
		this.station = station;
	}


	public Bicycle getBicycle() {
		return bicycle;
	}


	public void setBicycle(Bicycle bicycle) {
		this.bicycle = bicycle;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		Station station1=new Station("Anis",StationType.plus,new GPS(1,2));
		ParkingSlot S1=new ParkingSlot(station1, Status.free);
		ParkingSlot S2=new ParkingSlot(station1, Status.broken);
		System.out.println(S1.getStatus()==S2.getStatus());
	}

}
