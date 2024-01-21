package com.Project;

public class Main {

	public static void main(String[] args) {
		PayrollSystem prs=new PayrollSystem();
 		FullTimeEmployee emp1=new FullTimeEmployee("Naziya", 1, 700000);
		PartTimeEmployee emp2=new PartTimeEmployee("Saher", 2, 40, 100);
	   
		prs.addEmployee(emp1);
		prs.addEmployee(emp2);
		
		System.out.println("Initial Employee Details: ");
		prs.displayEmployee();
		
		System.out.println("Removing Employees: ");
		prs.removeEmployee(2);
		
		System.out.println("Remaining Employees details: ");
		prs.displayEmployee();
	}
}

