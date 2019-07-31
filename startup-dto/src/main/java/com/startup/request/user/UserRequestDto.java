package com.startup.request.user;

public class UserRequestDto {
	 
	private String email;

	private String mobileNumber;

	private String mobileOtpValue;
	
	private transient boolean create = true;
	
	private double amountInterested;

	private Double longitude;

	private Double latitude;

	private String  dob;
	
	private String city;
	
	private String name;

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

	public boolean isCreate() {
		return create;
	}

	public void setCreate(boolean create) {
		this.create = create;
	}

	public double getAmountInterested() {
		return amountInterested;
	}

	public void setAmountInterested(double amountInterested) {
		this.amountInterested = amountInterested;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
