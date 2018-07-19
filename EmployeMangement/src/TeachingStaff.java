
public class TeachingStaff extends Staff {

	private Integer noOfTeachingHours; 
	
	public void teach() {
		System.out.println("teaching now");
	}
	
	public TeachingStaff() {
		super();
		noOfTeachingHours = 0;
	}

	public TeachingStaff(String name, Integer noOfTeachingHours) {
		super(name);
		this.noOfTeachingHours = noOfTeachingHours;
	}

	@Override
	public void calculateSalary() {
		System.out.println("teaching salary");
		
	}
	
	

	
	
	
		
		
	}
