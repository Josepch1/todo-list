package josehomenhuck.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String name;
  
  @NotBlank
  private String description;
  
  private boolean completed;
  
  private int priority;

  public Todo(String name, String description, boolean completed, int priority) {
    this.name = name;
    this.description = description;
    this.completed = completed;
    this.priority = priority;
  }

  public boolean getCompleted() {
    return completed;
  }
}
