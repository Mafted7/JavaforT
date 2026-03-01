package intro_to_OOP;

public class motorBike {
	
	private int speed;
	
	void setSpeed(int speed) {
		
	    if(this.speed < 0) 
	    	this.speed = speed;
	   
	    
	}
	
	void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	int getSpeed() {
		return this.speed;
	}
	
	
    void start() {
    	System.out.println("Bike started");
    };
}
