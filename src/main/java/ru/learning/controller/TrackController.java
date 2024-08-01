package ru.learning.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.learning.dto.track.GetTrackDto;
import ru.learning.dto.track.PostTrackDto;
import ru.learning.entity.TrackEntity;
import ru.learning.repository.TrackRepository;
import ru.learning.service.TrackService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrackController {
    private final TrackService trackService;

    @GetMapping("/")
    public List<GetTrackDto> getAllTracks() {
        return trackService.getAllTracks();
    }

    @PostMapping("/")
    public TrackEntity insertTrack(@RequestBody PostTrackDto postTrackDto) {
        return trackService.addTrack(postTrackDto);
    }
}
