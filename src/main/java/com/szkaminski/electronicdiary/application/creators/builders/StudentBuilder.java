package com.szkaminski.electronicdiary.application.creators.builders;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.application.FullName;
import com.szkaminski.electronicdiary.application.creators.PersonFactory;
import com.szkaminski.electronicdiary.domain.student.Student;

import java.util.UUID;

public class StudentBuilder {

    private Student student;
    private PersonFactory personFactory;

    public StudentBuilder() {
        student = new Student();
        personFactory = new PersonFactory();
    }

    public StudentBuilder withRandomId(){
        student.setStudentId(new EntityId(UUID.randomUUID()));
        return this;
    }

    public StudentBuilder withRandomName(){
        student.setFullName(new FullName(personFactory.getRandomName(), personFactory.getRandomSurname()));
        return this;
    }

    public StudentBuilder withRandomSubjects(){
        student.setSubjects(personFactory.getSubjects());
        return this;
    }

    public Student build(){
        return student;
    }

}
