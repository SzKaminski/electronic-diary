package com.szkaminski.electronicdiary.infrastructure;

import com.szkaminski.electronicdiary.application.EntityId;
import com.szkaminski.electronicdiary.domain.diary.Diary;
import com.szkaminski.electronicdiary.domain.diary.DiaryRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryDiaryRepository implements DiaryRepository {
    private final Map<EntityId, Diary> database = new HashMap<>();
    @Override
    public Optional<Diary> findById(EntityId diaryId) {
        return Optional.ofNullable(database.get(diaryId));
    }

    @Override
    public void save(Diary diary) {
        database.put(diary.getDiaryId(), diary);
    }
}
