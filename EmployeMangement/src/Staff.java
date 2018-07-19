
public abstract class Staff {
	
	protected String name;
    
	
	public Staff() {
		name = "";
	}

	public Staff(String name) {
		super();
		this.name = name;
	}

	public abstract void calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
