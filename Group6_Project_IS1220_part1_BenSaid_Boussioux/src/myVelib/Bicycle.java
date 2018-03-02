package myVelib;

public class Bicycle {
	static int counter = 0 ; 
	private String type;
	private boolean IsUsed;
	private int ID;
	
	public Bicycle(String type) {
		super();
		counter++;
		this.type = type;
		this.ID = counter;
		this.IsUsed = false;
	}
	
	
	public boolean isUsed() {
		return IsUsed;
	}
	
	public String getType() {
		return type;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public int getID() {
		return ID;
	}
	
	
	public void setID(int iD) {
		ID = iD;
	}

	
public static void main(String[] args) {
	Bicycle B1 = new Bicycle("classique");
	System.out.println(B1.type + B1.ID);
	Bicycle B2 = new Bicycle("classique");
	System.out.println(B2.type + B2.ID);
	}

}