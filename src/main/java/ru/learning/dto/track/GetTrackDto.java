package ru.learning.dto.track;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GetTrackDto {
    private final Long id;
    private final String name;
    private final String description;
}
