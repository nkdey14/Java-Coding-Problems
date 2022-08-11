package app_java_Eccapsulation1;

public class A {
	
	// Restricting direct access to variables by making variables as private
	
	private int id; 
	private String name;

	// Data/Variables are bundled with methods
	// Here, Getters and Setters operating on the variables
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
