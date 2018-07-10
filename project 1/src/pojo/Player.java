package pojo;

public class Player {
     private Integer age;
     private Double name;
     
     public void kick() {
    	 System.out.println("kick");
    	 
     }
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getName() {
		return name;
	}
	public void setName(Double name) {
		this.name = name;
	}
}
