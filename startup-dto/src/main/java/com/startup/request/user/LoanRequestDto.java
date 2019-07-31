package com.startup.request.user;

public class LoanRequestDto {
	

	public static enum LoanType {
		PERSONALEXPENSES,MEDICALEXPENSES,OTHERS
	}
	

private Double amountInterested;

private Integer duration;

private Double emi;

private Integer interstRate;

private LoanType laonType=LoanType.PERSONALEXPENSES;


}
