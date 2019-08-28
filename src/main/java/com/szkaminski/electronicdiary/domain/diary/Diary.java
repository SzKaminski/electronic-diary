package com.szkaminski.electronicdiary.domain.diary;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.domain.ClassGroup;
import com.szkaminski.electronicdiary.domain.teacher.Teacher;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

public class Diary {

    @NonNull
    @Getter
    private EntityId diaryId;
    private ClassGroup classGroup;
    private List<Teacher.Specialization> specializations;

}
