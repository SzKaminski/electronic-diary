package com.szkaminski.electronicdiary.domain.student;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.catalogue.FullName;
import com.szkaminski.electronicdiary.domain.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class Student {

    @NonNull
    @Getter
    private EntityId studentId;
    private FullName fullName;

    private List<Subject> subjects;

}
