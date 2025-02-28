package com.springBootProj.taskMgmt.repository;

import com.springBootProj.taskMgmt.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
