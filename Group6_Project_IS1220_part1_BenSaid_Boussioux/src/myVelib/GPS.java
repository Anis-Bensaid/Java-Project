package myVelib;

import java.util.ArrayList;
import java.util.Arrays;

public class GPS {
	private double x;
	private double y;
	
	public GPS(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}
*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof GPS){
			GPS other = (GPS) obj;
			if	(x==other.x && y==other.y) {
			return true;
			}
		}
		return false;
	}
	
	public double distance(GPS GPS) {
		double lx=GPS.getX();
		double ly=GPS.getY();
		return Math.sqrt(Math.pow(this.x-lx,2)+Math.pow(this.y-ly,2));
	}
	
	
	public ArrayList<Station> isClosest(GPS position, ArrayList<Station> stations) {
		
		ArrayList<Station> closest = new ArrayList<Station>();
		double mindist = Double.MAX_VALUE;
		double eps= Math.pow(10, -15);
		
		for (Station station:stations) {
			GPS location=station.getPosition();
			if (position.equals(location)){
				continue;
			}

			double dist=position.distance(location);
			
			if ((dist-eps)<=mindist) {
				if (Math.abs(dist-mindist)>eps) {
					mindist=dist;
					closest.clear();
				}
				closest.add(station);
			}	
		}
		return closest;
	}
	
public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

public static void main(String[] args) {
	GPS l1=new GPS(0,1);
	GPS l2= new GPS(0,0);
	GPS l3= new GPS(1,0);
	GPS l4= new GPS(1/Math.sqrt(2),1/Math.sqrt(2));
	System.out.println(l1.equals(l3));
	System.out.println(l1.equals(l2));
	System.out.println(l2.distance(l1));
	GPS[] desti = {l1,l2,l3,l4}; 
	ArrayList<GPS> destinationss = new ArrayList<GPS>(Arrays.asList(desti));
	System.out.println(l2.distance(l4));
	System.out.println(l2.distance(l3)==l2.distance(l1));
	
}	
	
}


