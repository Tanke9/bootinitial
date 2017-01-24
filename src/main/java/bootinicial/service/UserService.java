package bootinicial.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootinicial.dao.UserRepository;
import bootinicial.model.User;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;

	/**
	 * @param userRepository
	 */
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		for(User user : userRepository.findAll()){
			users.add(user);
		}
		return users;
	}
	
	public User findUser(int id){
		return userRepository.findOne(id);
	}
	
	public void save(User user){
		userRepository.save(user);
	}
	
	public void delete(int id){
		userRepository.delete(id);
	}
}
