package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ContractEmployee")
public class ContractEmployee extends Employee {
	@Column(name ="Contract Employee pay per hr")
	int pay_per_hour;
	@Column(name="Contract Period ")
	int contract_period;
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public int getContract_period() {
		return contract_period;
	}
	public void setContract_period(int contract_period) {
		this.contract_period = contract_period;
	}
	

}
