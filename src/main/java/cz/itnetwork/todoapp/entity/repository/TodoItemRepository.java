package cz.itnetwork.todoapp.entity.repository;

import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItemEntity, Long> {

}
