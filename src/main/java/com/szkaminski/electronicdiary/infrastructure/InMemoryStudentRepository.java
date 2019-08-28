package com.szkaminski.electronicdiary.infrastructure;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.domain.student.Student;
import com.szkaminski.electronicdiary.domain.student.StudentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryStudentRepository implements StudentRepository {

    private final Map<EntityId, Student> database = new HashMap<>();

    @Override
    public Optional<Student> findById(EntityId studentId) {
        return Optional.ofNullable(database.get(studentId));
    }

    @Override
    public void save(Student student) {
        database.put(student.getStudentId(), student);
    }
}
