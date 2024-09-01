package cz.itnetwork.todoapp.service;

import cz.itnetwork.todoapp.dto.CategoryDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import cz.itnetwork.todoapp.entity.repository.CategoryRepository;
import cz.itnetwork.todoapp.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity entity = categoryMapper.toEntity(categoryDTO);
        entity = categoryRepository.saveAndFlush(entity);
        return categoryMapper.toDTO(entity);
    }

    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryEntity -> categoryMapper.toDTO(categoryEntity))
                .toList();
    }
}
