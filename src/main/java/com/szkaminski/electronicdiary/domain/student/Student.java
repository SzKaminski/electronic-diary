package com.szkaminski.electronicdiary.domain.student;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.application.FullName;
import com.szkaminski.electronicdiary.domain.Mark;
import com.szkaminski.electronicdiary.domain.Subject;
import com.szkaminski.electronicdiary.domain.student.events.StudentAssesed;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class Student {

    @NonNull
    @Getter
    private EntityId studentId;
    private FullName fullName;

    private List<Subject> subjects;

    public Optional<StudentAssesed> assess(EntityId studentId, EntityId teacherId, Teacher.@NonNull Specialization teacherSpecialization, Mark a) {

        return Optional.of(new StudentAssesed(studentId,teacherId,teacherSpecialization,a));
    }
}
