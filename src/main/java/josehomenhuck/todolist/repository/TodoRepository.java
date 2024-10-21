package josehomenhuck.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import josehomenhuck.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

  List<Todo> findByPriority(Integer priority);

  List<Todo> findByNameContaining(String name);
}
