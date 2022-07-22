package prototype;

import java.util.Arrays;

public class PermenantEmp extends Employee{
	
	private boolean benefits;
	
	public boolean isBenefits() {
		return benefits;
	}
	
	public void setBenefits(boolean benefits) {
		this.benefits = benefits;
	}
	
	public String toString() {
		return "ContractEmp [Benefits=" + benefits + ", ID=" + getId() +", Name=" +getName() +", Exp=" + getnumOfExp() +", Skills=" + Arrays.toString(getSkills()) + "]";
	}

}
