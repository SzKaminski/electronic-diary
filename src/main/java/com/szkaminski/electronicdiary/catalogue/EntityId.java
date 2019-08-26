package com.szkaminski.electronicdiary.catalogue;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class EntityId {

    @NonNull UUID uuid;
}
