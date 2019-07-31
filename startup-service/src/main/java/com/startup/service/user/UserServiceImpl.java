package com.startup.service.user;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.entity.user.User;
import com.startup.repo.user.UserRepo;
import com.startup.request.user.UserRequestDto;
import com.startup.response.user.UserResponseDto;
import com.startup.service.mobile.MobileUtil;
@Service
public  class UserServiceImpl implements UserService {

	
	
	@Autowired
	private UserRepo userRepo;
	
	
	
	@Autowired
	private MobileUtil mobileUtil;
	
	
	private String details ="OTP Matched";
	
	@Override
	@Transactional
	public UserResponseDto register(UserRequestDto userRequestDto) {
		User user=userRepo.findByMobileNumber(userRequestDto.getMobileNumber());
      if(userRequestDto.isCreate() && user == null) {
     String mobleOtpSession= mobileUtil.mobileOtpSent(userRequestDto.getMobileNumber());
    	     user=new User();
    	     user.setMobileNumber(userRequestDto.getMobileNumber());
        	 user.setMobileOtpSent(true);
        	 user.setMobileOtpSession(mobleOtpSession);
             user.setRegisteredOn(new Date());
             userRepo.save(user);
         
        }
      
      else if(user!=null&&user.getMobileNumber().equals(userRequestDto.getMobileNumber())) {
    	
    	if( mobileUtil.mobileOtpVerify(userRequestDto.getMobileOtpValue(), user.getMobileOtpSession()).equalsIgnoreCase(details));
    	
          user.setMobileNumberVerified(true);
          
      
           }
         UserResponseDto userResponseDto=new UserResponseDto();
        userResponseDto.setMobileNumber(userRequestDto.getMobileNumber());
		userResponseDto.setMobileNumberVerifiled(user.isMobileNumberVerified());        
		return userResponseDto;
		
	}
	 
}
