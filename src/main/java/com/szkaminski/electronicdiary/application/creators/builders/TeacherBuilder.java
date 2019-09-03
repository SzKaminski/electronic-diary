package com.szkaminski.electronicdiary.application.creators.builders;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.application.FullName;
import com.szkaminski.electronicdiary.application.creators.PersonFactory;
import com.szkaminski.electronicdiary.domain.Person;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;

import java.util.UUID;

public class TeacherBuilder {

    private Teacher teacher;
    private PersonFactory personFactory;

    public TeacherBuilder() {
        this.teacher = new Teacher();
        personFactory = new PersonFactory();
    }

    public TeacherBuilder withRandomId() {
        teacher.setTeacherId(new EntityId(UUID.randomUUID()));
        return this;
    }

    public TeacherBuilder withRandomName() {
        teacher.setFullName(new FullName(personFactory.getRandomName(), personFactory.getRandomSurname()));
        return this;
    }

    public TeacherBuilder withRandomSpecializaton(){
        return this;
    }

    public TeacherBuilder withRandomYearsOfExperience() {
        return this;
    }

    public Teacher build() {
        return teacher;
    }
}
