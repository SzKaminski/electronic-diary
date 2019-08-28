package com.szkaminski.electronicdiary.application;

import com.szkaminski.electronicdiary.DomainEvents;
import com.szkaminski.electronicdiary.domain.Mark;
import com.szkaminski.electronicdiary.domain.student.Student;
import com.szkaminski.electronicdiary.domain.student.StudentRepository;
import com.szkaminski.electronicdiary.domain.student.events.StudentAssesed;
import lombok.AllArgsConstructor;

import java.util.Optional;

import static com.szkaminski.electronicdiary.application.Result.Rejection;
import static com.szkaminski.electronicdiary.application.Result.Sukcess;

@AllArgsConstructor
public class MarkService {

    private final StudentRepository studentRepository;
    private final DomainEvents domainEvents;


    private Student findStudent(MarkCommand command){
        return studentRepository.findById(command.getStudentId()).orElseThrow(IllegalArgumentException::new);
    }

    Result studentAssessed(MarkCommand command){
        Student student = findStudent(command);
        Optional<StudentAssesed> event = student.assess(command.getStudentId(), command.getTeacherId(), command.getTeacherSpecialization(), Mark.A);
        event.ifPresent(domainEvents::assess);
        studentRepository.save(student);
        return event.map(evt -> Sukcess).orElse(Rejection);

    }

}
