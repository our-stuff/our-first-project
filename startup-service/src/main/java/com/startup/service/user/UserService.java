package com.startup.service.user;

import com.startup.request.user.UserRequestDto;
import com.startup.response.user.UserResponseDto;

public interface UserService {
public UserResponseDto register(UserRequestDto userRequest);
}
