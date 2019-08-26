package com.szkaminski.electronicdiary.domain.teacher;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.catalogue.FullName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class Teacher {

    @NonNull
    @Getter
    private final EntityId teacherId;
    @NonNull
    private FullName fullName;
    @NonNull
    private Specialization specialization;

    private int yearsOfExperience;

    public enum Specialization {
        MATH, PHYSISC, POLISH, ENGLISH, GEOGRAPHY, HISTORY, CHEMISTRY, WF
    }

}
