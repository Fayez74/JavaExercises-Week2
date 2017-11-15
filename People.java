package People;

import java.util.ArrayList;

public class People {
	
	private String name;
	private String jobTitle;
	private int age;

	People(String name, String jobTitle, int age){
		
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public String getName(){
		
		return name;
	}
	
	public String getjobTitle(){
		
		return jobTitle;
	}
	
	public int getAge(){
	
		return age;
	}
	
	public String toString() {
		
		return "Name:" + name + " Job Title:" + jobTitle + " Age:" + age; 
		
		
	}
	

}
