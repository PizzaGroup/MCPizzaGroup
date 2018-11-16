package springbootmcpizza.mcpizza;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
//Iterable<Message> findAllByHashTagContainingIgnoreCase(String status);
}
