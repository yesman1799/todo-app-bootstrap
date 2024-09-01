package cz.itnetwork.todoapp.service;


import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import cz.itnetwork.todoapp.entity.repository.CategoryRepository;
import cz.itnetwork.todoapp.entity.repository.TodoItemRepository;
import cz.itnetwork.todoapp.mapper.TodoItemMapper;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoItemService {
    @Autowired
    private TodoItemRepository todoItemRepository;

    @Autowired
    private TodoItemMapper todoItemMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    public TodoItemDTO create(TodoItemDTO todoItemDTO) {
        TodoItemEntity todoItemEntity = todoItemMapper.toEntity(todoItemDTO);
        Long categoryId = todoItemDTO.getCategoryId();
        CategoryEntity categoryEntity = categoryRepository.getReferenceById(categoryId);
        todoItemEntity.setCategoryEntity(categoryEntity);

        todoItemEntity = todoItemRepository.saveAndFlush(todoItemEntity);




        todoItemEntity = todoItemRepository.saveAndFlush(todoItemEntity);

        return todoItemMapper.toDTO(todoItemEntity);
    };

    public List<TodoItemDTO> getAll(){
        List<TodoItemEntity> todoItemEntities = todoItemRepository.findAll();

        List<TodoItemDTO> todoItemDTOs = new ArrayList<>();

        for (TodoItemEntity todoItemEntity : todoItemEntities) {
            TodoItemDTO todoItemDTO = todoItemMapper.toDTO(todoItemEntity);
            todoItemDTOs.add(todoItemDTO);

        }
        return todoItemRepository.findAll().stream().map(todoItemEntity -> todoItemMapper.toDTO(todoItemEntity)).toList();
    }


}
