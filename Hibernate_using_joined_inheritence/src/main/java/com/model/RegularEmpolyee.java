package com.model;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="RegularEmployee_type3")
@AttributeOverrides({@AttributeOverride(name = "eid", column = @Column(name = "EmployeeId")),@AttributeOverride(name = "ename", column = @Column(name = "EmployeeName"))})
@PrimaryKeyJoinColumn(name = "EmployeeId")
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
