package prototype;

import java.util.Arrays;

public abstract class Employee implements Cloneable {

	private int id;
	private String name;
	private int numOfExp;
	private String[] skills;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getnumOfExp() {
		return numOfExp;
	}
	
	public void setNumOfExp(int numOfExp) {
		this.numOfExp = numOfExp;
	}
	
	public String[] getSkills() {
		return skills;
	}
	
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public String toString() {
		return "Employee [id=" + id +", name=" + name +", numOfExp=" + numOfExp +", skills=" + Arrays.toString(skills) +"]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
