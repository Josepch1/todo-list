package josehomenhuck.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import josehomenhuck.todolist.entity.Todo;
import josehomenhuck.todolist.repository.TodoRepository;

@Service
public class TodoService {
  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  public List<Todo> list() {
    Sort sort = Sort.by("priority").descending().and(
      Sort.by("name").ascending());
    return todoRepository.findAll(sort);
  }

  public Todo listById(Long id) {
    return todoRepository.findById(id).get();
  }

  public List<Todo> listByPriority(int priority) {
    return todoRepository.findByPriority(priority);
  }

  public List<Todo> listByName(String name) {
    return todoRepository.findByNameContaining(name);
  }

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> update(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> delete(Long id) {
    todoRepository.deleteById(id);
    return list();
  }
}
