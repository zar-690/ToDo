package com.itvedant.ToDo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itvedant.ToDo.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {

}
