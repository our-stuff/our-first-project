package com.startup.entity.user;

	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.EnumType;
	import javax.persistence.Enumerated;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	@Entity
	@Table(name = "`user`")
	public class User {
		
		public static enum Status {
			REGISTERED
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@Column(name="name",nullable=false)
		private String name;
		
		@Column(name="dateofbirth",nullable=false)
		private String dob;
		
		@Column(name="city",nullable=false)
		private String city;
		
		
		@Column(name = "email",  nullable = false)
		private String email;
		
		@Column(name = "mobile_number", nullable = false)
		private String mobileNumber;
		
		@Column(name = "status", nullable = false)
		@Enumerated(EnumType.STRING)
		private Status status = Status.REGISTERED;
		
		
		@Column(name = "country_id",nullable = true )
		private Integer countryId;
		
		@Column(name = "registered_on", nullable = false, insertable = true, updatable = false)
		@Temporal(TemporalType.TIMESTAMP)
		private Date registeredOn = new Date();
		
		
		@Column(name = "mobile_otp_session", nullable = false)
		private String mobileOtpSession;
		
		@Column(name = "mobile_otp_sent", nullable = false)
		private boolean mobileOtpSent = true;
		
		@Column(name = "mobile_number_verified", nullable = false)
		private boolean mobileNumberVerified = false;
		
		@Column(name = "kyc_file_path", nullable = true)
		private String kycFilePath;

		@Column(name = "longitude", nullable = true)
		private Double longitude;

		@Column(name = "latitude", nullable = true)
		private Double latitude;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Integer getCountryId() {
			return countryId;
		}

		public void setCountryId(Integer countryId) {
			this.countryId = countryId;
		}

		public Date getRegisteredOn() {
			return registeredOn;
		}

		public void setRegisteredOn(Date registeredOn) {
			this.registeredOn = registeredOn;
		}

		public String getMobileOtpSession() {
			return mobileOtpSession;
		}

		public void setMobileOtpSession(String mobileOtpSession) {
			this.mobileOtpSession = mobileOtpSession;
		}

		public boolean isMobileOtpSent() {
			return mobileOtpSent;
		}

		public void setMobileOtpSent(boolean mobileOtpSent) {
			this.mobileOtpSent = mobileOtpSent;
		}

		public boolean isMobileNumberVerified() {
			return mobileNumberVerified;
		}

		public void setMobileNumberVerified(boolean mobileNumberVerified) {
			this.mobileNumberVerified = mobileNumberVerified;
		}

		public String getKycFilePath() {
			return kycFilePath;
		}

		public void setKycFilePath(String kycFilePath) {
			this.kycFilePath = kycFilePath;
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

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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

		

		
	}


