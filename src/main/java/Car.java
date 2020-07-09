//Can only have ONE abstract class in its hierarchy
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting car");
	}

	@Override
	public void shutDown() {
		System.out.println("Shutting down car");
	}

}