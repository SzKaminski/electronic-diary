package com.szkaminski.electronicdiary.domain;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.domain.student.Student;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class ClassGroup {

    @NonNull
    private EntityId classId;

    private Teacher classTeacher;
    @NonNull
    private List<Student> classGroup;
    @NonNull
    private int numbOfStudents;

    public ClassGroup() {
        numbOfStudents = classGroup.size();
    }
}
