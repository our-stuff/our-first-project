package com.startup.response.user;

public class UserResponseDto {
	private String email;

	private String mobileNumber;

	private String mobileOtpValue;
	
	private boolean mobileNumberVerifiled;
	
	

	public boolean isMobileNumberVerifiled() {
		return mobileNumberVerifiled;
	}

	public void setMobileNumberVerifiled(boolean mobileNumberVerifiled) {
		this.mobileNumberVerifiled = mobileNumberVerifiled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileOtpValue() {
		return mobileOtpValue;
	}

	public void setMobileOtpValue(String mobileOtpValue) {
		this.mobileOtpValue = mobileOtpValue;
	}

}
