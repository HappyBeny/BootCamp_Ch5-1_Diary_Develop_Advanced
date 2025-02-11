package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query("SELECT t FROM Todo t JOIN FETCH t.user ORDER BY t.modifiedAt DESC")
    Page<Todo> findAllWithUserByOrderByModifiedAtDesc(Pageable pageable);

    int countById(Long todoId);
}
