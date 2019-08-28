package com.szkaminski.electronicdiary.domain.student.events;

import com.szkaminski.electronicdiary.DomainEvent;
import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.domain.Mark;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import lombok.Value;

@Value
public class StudentAssesed implements DomainEvent {

    EntityId studentId;
    EntityId teacherId;
    Teacher.Specialization specialization;
    Mark mark;

}
