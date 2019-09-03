package com.szkaminski.electronicdiary.application.creators;

import com.szkaminski.electronicdiary.application.creators.builders.StudentBuilder;
import com.szkaminski.electronicdiary.application.creators.builders.TeacherBuilder;
import com.szkaminski.electronicdiary.domain.Person;
import com.szkaminski.electronicdiary.domain.Subject;
import com.szkaminski.electronicdiary.domain.student.Student;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory implements EntitesFactory {

    private static final String[] names = {"James", "John", "Robert", "Michael", "William", "David"};
    private static final String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Brown"};
    private static final Teacher.Specialization[] specializations = Teacher.Specialization.values();
    private Random random = new Random();

    @Override
    public Student getStudent() {
        return new StudentBuilder().withRandomId().withRandomName().withRandomSubjects().build();
    }

    @Override
    public Person getTeacher() {
        return new TeacherBuilder().withRandomId().withRandomName()
                .withRandomSpecializaton().withRandomYearsOfExperience().build();
    }

    public String getRandomName() {
        return names[random.nextInt(names.length)];
    }

    public String getRandomSurname() {
        return names[random.nextInt(surnames.length)];
    }

    public List<Subject> getSubjects() {
        List<Subject> subjectList = new ArrayList<>();
        for (Teacher.Specialization t : specializations) {
            subjectList.add(new Subject(t));
        }
        return subjectList;
    }

}
