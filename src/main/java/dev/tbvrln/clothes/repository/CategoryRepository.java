package dev.tbvrln.clothes.repository;

import dev.tbvrln.clothes.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
