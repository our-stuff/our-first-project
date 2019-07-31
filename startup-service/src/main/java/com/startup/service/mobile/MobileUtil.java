package com.startup.service.mobile;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.startup.customexceptions.MobileException;
import com.startup.service.googlegsonutils.GsonUtils;
@Component
public class MobileUtil {
@Autowired
private RestTemplate restTemplate; 
@Value("${twoFactorHost}")
private String twoFactorHost;
@Value("${twoFactorAPIKey}")	
private String twoFactorAPIKey;
@Value("${twoFactorVerifyPath}")	
private String twoFactorVerifyPath;
@Value("${twoFactorTempalteName}")
private String twoFactorTempalteName;
@Value("${successCode}")
private String successCode;
@Value("${badRequest}")
private String badRequest;

@Autowired
private GsonUtils gsonUtils;

public String mobileOtpSent(String mobileNumber) {
if(mobileNumber.equals("")||mobileNumber==null){
	throw new MobileException();
}
else {
String jsonString= restTemplate.exchange(twoFactorHost+twoFactorAPIKey+"/SMS/"+mobileNumber+"/AUTOGEN/"+twoFactorTempalteName, HttpMethod.GET, null,String.class).getBody();
return gsonUtils.getDetails(jsonString).getDetails(); 	
}
}

public String mobileOtpVerify(String mobileOtpValue,String mobileOtpSession) {

	String jsonString= restTemplate.exchange(twoFactorHost+twoFactorAPIKey+"/SMS/VERIFY"+"/"+mobileOtpSession+"/"+mobileOtpValue, HttpMethod.GET, null,String.class).getBody();
	
	return gsonUtils.getDetails(jsonString).getDetails();
	
}
}