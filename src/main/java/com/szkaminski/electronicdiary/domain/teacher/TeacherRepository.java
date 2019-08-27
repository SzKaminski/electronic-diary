package com.szkaminski.electronicdiary.domain.teacher;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.domain.student.Student;

import java.util.Optional;

public interface TeacherRepository {

    Optional<Teacher> findById(EntityId teacherId);

    void save(Teacher teacher);
}
