package com.szkaminski.electronicdiary.domain.diary;

import com.szkaminski.electronicdiary.application.EntityId;

import java.util.Optional;

public interface DiaryRepository {

    Optional<Diary> findById(EntityId diaryId);

    void save(Diary diary);
}
