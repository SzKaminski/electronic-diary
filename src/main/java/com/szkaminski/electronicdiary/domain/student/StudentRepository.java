package com.szkaminski.electronicdiary.domain.student;

import com.szkaminski.electronicdiary.application.EntityId;

import java.util.Optional;

public interface StudentRepository {

    Optional<Student> findById(EntityId studentId);

    void save(Student student);
}
