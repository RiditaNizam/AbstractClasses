public abstract class Machine {

	// Every class that extends Machine will have an id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Have to use this in classes that extend Machine
	public abstract void start();

	public abstract void shutDown();

	public void run() {
		// Calling 2 abstract methods
		start();
		shutDown();
	}

}