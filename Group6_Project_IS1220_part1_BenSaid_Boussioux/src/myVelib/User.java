package myVelib;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListMap;



public class User {
	
	Scanner reader = new Scanner(System.in);
	
	public enum UserState {riding,dropping_on, dropping_off,unuse}; 
	
	static int counter;
	private int id;
	private String name;
	private GPS position;
	private Card card;
	private Network network;

	private ConcurrentSkipListMap <Timestamp, UserState> userActions = new ConcurrentSkipListMap<Timestamp, User.UserState>();
	private ArrayList<String> messageBox;
	

	public User(String name, GPS position, myVelib.Card card, Network network) {
		super();
		this.name = name;
		this.position = position;
		this.card = card;
		this.network = network;
	}

	
	private GPS SelectDestination() {
		System.out.println("Enter the x coordinate of your destination : ");
		Double x = reader.nextDouble();
		System.out.println("Enter the y coordinate of your destination : ");
		Double y = reader.nextDouble();
		return new GPS(x,y);
	}

	
	private void SetPath() {
		
	}


	

	/** Fonctions de parcours
	 * 
	 */
	 
	public void findDepartureStation(GPS gps) {
		
	}

	

}
