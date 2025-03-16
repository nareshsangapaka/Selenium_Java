package examples;

public class VaribleInstance {
	// to declare within class and out side methods
	int sid = 1100;

	public static void main(String[] args) {
		// must created object here
		
		VaribleInstance obj = new VaribleInstance();
		System.out.println(obj.sid);
	}

}
