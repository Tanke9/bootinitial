package bootinicial.dao;

import org.springframework.data.repository.CrudRepository;

import bootinicial.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
