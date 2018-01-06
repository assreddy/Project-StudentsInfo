package com.google.school.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Embeddable
public class Fee {
	@Column(insertable = true, updatable = false)
	int yearlyFee;
	@Column(insertable = true, updatable = false)
	int feePaid;
	
	public int getYearlyFee() {
		return yearlyFee;
	}
	public void setYearlyFee(int yearlyFee) {
		this.yearlyFee = yearlyFee;
	}
	public int getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(int feePaid) {
		this.feePaid = feePaid;
	}

}
