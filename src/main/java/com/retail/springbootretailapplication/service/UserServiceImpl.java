package com.retail.springbootretailapplication.service;
import org.springframework.transaction.annotation.Transactional;
import com.retail.springbootretailapplication.Exception.ResourceNotFoundException;
import com.retail.springbootretailapplication.Model.User;
import com.retail.springbootretailapplication.repository.UserRepository;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Override
	public User getUser(long id) {
        return userRepository
        		.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
          
   
    }
	@Override
	   public User save(User user) {
	        return userRepository.save(user);
	      
    
    
    
}

}
