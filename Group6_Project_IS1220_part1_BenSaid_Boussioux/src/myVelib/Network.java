package myVelib;

import java.util.ArrayList;

public class Network {
	private ArrayList<Station> stations;
	private ArrayList<User> users;
	private ArrayList<Bicycle> bicycles;
	
	public Network(ArrayList<Station> stations, ArrayList<User> users, ArrayList<Bicycle> bicycles) {
		super();
		this.stations = stations;
		this.users = users;
		this.bicycles = bicycles;
	}

	public ArrayList<Station> getStations() {
		return stations;
	}

	public void setStations(ArrayList<Station> stations) {
		this.stations = stations;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Bicycle> getBicycles() {
		return bicycles;
	}

	public void setBicycles(ArrayList<Bicycle> bicycles) {
		this.bicycles = bicycles;
	}
	
	public void addStation(Station station) {
		this.getStations().add(station);
	}
	
	public void addUser(User user) {
		this.getUsers().add(user);
	}
	
	public void addBicycle(Bicycle bicycle) {
		this.getBicycles().add(bicycle);
	}
}
