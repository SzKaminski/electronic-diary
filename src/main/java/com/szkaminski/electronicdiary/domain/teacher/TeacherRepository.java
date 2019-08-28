package com.szkaminski.electronicdiary.domain.teacher;

import com.szkaminski.electronicdiary.application.EntityId;

import java.util.Optional;

public interface TeacherRepository {

    Optional<Teacher> findById(EntityId teacherId);

    void save(Teacher teacher);
}
