package com.szkaminski.electronicdiary.infrastructure;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import com.szkaminski.electronicdiary.domain.teacher.TeacherRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryTeacherRepository implements TeacherRepository {

    private final Map<EntityId, Teacher> database = new HashMap<>();

    @Override
    public Optional<Teacher> findById(EntityId teacherId) {
        return Optional.ofNullable(database.get(teacherId));
    }

    @Override
    public void save(Teacher teacher) {
        database.put(teacher.getTeacherId(), teacher);
    }
}
