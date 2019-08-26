package com.szkaminski.electronicdiary.domain;

import com.szkaminski.electronicdiary.catalogue.EntityId;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;

import java.util.List;

public class Diary {

    private EntityId diaryId;
    private ClassGroup classGroup;
    private List<Teacher.Specialization> specializations;

}
