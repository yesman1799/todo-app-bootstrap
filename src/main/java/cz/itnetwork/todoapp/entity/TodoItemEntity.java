package cz.itnetwork.todoapp.entity;

import jakarta.persistence.*;

@Entity
public class TodoItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private CategoryEntity categoryEntity;

    public Long getCategoryId() {
        if (this.categoryEntity == null) {
            return null;
        }
        return this.categoryEntity.getId();
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
