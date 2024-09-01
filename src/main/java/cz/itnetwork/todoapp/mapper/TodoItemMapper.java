package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoItemMapper {

    TodoItemDTO toDTO(TodoItemEntity source);

    TodoItemEntity toEntity(TodoItemDTO source);
}
