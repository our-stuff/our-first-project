package com.startup.repo.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.startup.entity.user.User;
@Repository
public interface UserRepo extends PagingAndSortingRepository<User, Integer> {
public	User findByMobileNumber(String mobileNumber);

}
