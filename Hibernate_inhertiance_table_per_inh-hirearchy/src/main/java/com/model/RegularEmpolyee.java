package com.model;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "RegularEmployee")
public class RegularEmpolyee extends Employee {
	@Column(name = "RegularEmployee Salary")
	int salary;
	@Column(name = "RegularEmployee Bonus")
	int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
	
	

}
