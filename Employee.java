package com.Project;

import java.util.ArrayList;

//abstraction concepts
abstract public class Employee {
	private String name;
	private int id;
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id; 
	}
	
//	Encapsulation
		public String getName() {
			return name;
	}
		public int getId() {
			return id;
		}
	
	public abstract double CalculateSalary();
	
//	toString(): method used to converts any value to the string value 
	public String toString() {
	  return "Employee [name="+name+", id=" +id+ ", salary="+CalculateSalary()+"]";
   }
}

//chlid class
 class FullTimeEmployee extends Employee{
	 private double monthlySalary;
	 
	 public FullTimeEmployee(String name, int id, double monthlySalary) {
		 super(name, id);// to call parent vaeriables
		 this.monthlySalary=monthlySalary; 
	 }
	 
//	 Polymorphism concepts
	@Override
	public double CalculateSalary() {
		return monthlySalary;
	}
 }
 
//chlid class
 class PartTimeEmployee extends Employee{
	  
	private int hoursWorked;
    private double hourlyRate;
	   
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}

	@Override
	public double CalculateSalary() {
		return hoursWorked*hourlyRate;
	}
 } 
 
 
 
 class PayrollSystem{
	 private ArrayList<Employee> employeeList;
	 
	 public PayrollSystem() {
		 employeeList=new ArrayList<>();
	 }
	 
	//To Add the Employee members
	 public void addEmployee(Employee employee) {
		 employeeList.add(employee);
	 }
	 
	//To remove the Employee members
	 public void removeEmployee(int id) {
		 Employee employeeToRemove=null;
		 
		 //for-each loop remove  which is not work
		 for(Employee employee:employeeList) {
			 if(employee.getId()==id) {
				 employeeToRemove=employee;
				 break;
			 }
		 }
			 if(employeeToRemove !=null) {
				 employeeList.remove(employeeToRemove);
			 }
		 }
		 
//		 To display the Employee List
	public void displayEmployee() {
			 for(Employee employee:employeeList) {
				System.out.println(employee);
			 }
		 }
	 }
 

	 
	

 