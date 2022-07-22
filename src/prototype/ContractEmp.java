package prototype;

import java.util.Arrays;

public class ContractEmp extends Employee{
	
	private int contractTimeInMonths;
	
	public int getContractTimeInMonths() {
		return contractTimeInMonths;
	}
	
	public void setContractTimeInMonths(int contractTimeInMonths) {
		this.contractTimeInMonths = contractTimeInMonths;
	}
	
	public String toString() {
		return "ContractEmp [ContractTime=" + contractTimeInMonths + ", ID=" + getId() +", Name=" +getName() +", Exp=" + getnumOfExp() +", Skills=" + Arrays.toString(getSkills()) + "]";
	}

}
