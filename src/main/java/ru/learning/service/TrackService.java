package ru.learning.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.learning.dto.track.GetTrackDto;
import ru.learning.dto.track.PostTrackDto;
import ru.learning.entity.TrackEntity;
import ru.learning.repository.TrackRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackService {
    private final TrackRepository trackRepository;

    public List<GetTrackDto> getAllTracks() {
        return trackRepository.findAll().stream().map((trackEntity) -> GetTrackDto
                        .builder()
                        .id(trackEntity.getId())
                        .description(trackEntity.getDescription())
                        .name(trackEntity.getName())
                        .build())
                .toList();
    }

    public TrackEntity addTrack(PostTrackDto postTrackDto) {
        return trackRepository.save(TrackEntity
                .builder()
                .name(postTrackDto.getName())
                .description(postTrackDto.getDescription())
                .build()
        );
    }
}
