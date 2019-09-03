package com.szkaminski.electronicdiary.application;

import com.szkaminski.electronicdiary.domain.Mark;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import lombok.NonNull;
import lombok.Value;

@Value
public class MarkCommand {

    @NonNull
    EntityId studentId;
    @NonNull
    EntityId teacherId;
    @NonNull
    Teacher.Specialization teacherSpecialization;
    @NonNull
    Mark mark;
}
