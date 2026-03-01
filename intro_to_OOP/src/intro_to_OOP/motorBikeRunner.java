package intro_to_OOP;

public class motorBikeRunner {

	public static void main(String[] args) {
		
		motorBike toyota = new motorBike();
		motorBike lexus = new motorBike();
		
		toyota.start();
		lexus.start();
		
		toyota.setSpeed(80);
		lexus.setSpeed(100);
		
		toyota.increaseSpeed(200);
		lexus.increaseSpeed(400);
		
		toyota.decreaseSpeed(80);
		lexus.decreaseSpeed(700);
		
		System.out.println(toyota.getSpeed());
		System.out.println(lexus.getSpeed());

	}

}
