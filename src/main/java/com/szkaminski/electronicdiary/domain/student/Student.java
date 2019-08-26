package com.szkaminski.electronicdiary.domain.student;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.catalogue.FullName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class Student {

    @NonNull
    @Getter
    private EntityId studentId;
    private FullName fullName;

}
