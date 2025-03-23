package HTech.AppWithSpringboot.Repositories;

import HTech.AppWithSpringboot.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
}
