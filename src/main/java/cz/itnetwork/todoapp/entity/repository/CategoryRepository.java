package cz.itnetwork.todoapp.entity.repository;

import cz.itnetwork.todoapp.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<CategoryEntity, Long> {


}
