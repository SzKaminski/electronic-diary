package com.szkaminski.electronicdiary.application.creators.builders;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.application.FullName;
import com.szkaminski.electronicdiary.application.creators.StudentFactory;
import com.szkaminski.electronicdiary.domain.student.Student;

import java.util.UUID;

public class StudentBuilder {

    private Student student;
    private StudentFactory studentFactory;

    public StudentBuilder() {
        student = new Student();
    }

    public StudentBuilder withRandomId(){
        student.setStudentId(new EntityId(UUID.randomUUID()));
        return this;
    }

    public StudentBuilder withRandomName(){
        student.setFullName(new FullName(studentFactory.getRandomName(),studentFactory.getRandomSurname()));
        return this;
    }

    public StudentBuilder withRandomSubjects(){
        student.setSubjects(studentFactory.getSubjects());
        return this;
    }

    public Student build(){
        return student;
    }

}
