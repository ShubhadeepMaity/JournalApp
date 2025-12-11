package net.Shubhadeep.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import net.Shubhadeep.journalApp.entity.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{

	User findByUserName(String userName);

	void deleteByUserName(String username);
	
}
