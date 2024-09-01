package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.CategoryDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDTO(CategoryEntity source);
    CategoryEntity toEntity(CategoryDTO source);
}
