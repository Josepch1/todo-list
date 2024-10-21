package josehomenhuck.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import josehomenhuck.todolist.entity.Todo;
import josehomenhuck.todolist.service.TodoService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("todos")
public class TodoController {
  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  
  @GetMapping
  List<Todo> list() {
    return todoService.list();
  }

  @GetMapping("{id}")
  Todo getTodoById(@PathVariable("id") Long id) {
    return todoService.listById(id);
  }

  @GetMapping("priority/{priority}")
  List<Todo> listByPriority(@PathVariable("priority") int priority) {
    return todoService.listByPriority(priority);
  }

  @GetMapping("name/{name}")
  List<Todo> listByName(@PathVariable("name") String name) {
    return todoService.listByName(name);
  }
  

  @PostMapping
  List<Todo> create(@RequestBody @Valid Todo todo) {
    return todoService.create(todo);
  }

  @PutMapping
  List<Todo> update(@RequestBody Todo todo) {
    return todoService.update(todo);
  }

  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable("id") Long id) {
    return todoService.delete(id);
  }
}
