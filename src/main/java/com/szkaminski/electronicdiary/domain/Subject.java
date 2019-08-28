package com.szkaminski.electronicdiary.domain;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.domain.student.Student;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;

import java.util.List;
import java.util.Map;

public class Subject {

    private EntityId subjectId;
    private Teacher.Specialization name;
    private List<Teacher> teachers;
    private Map<Student, List<Mark>> marks;
}
