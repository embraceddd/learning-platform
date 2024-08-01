package ru.learning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learning.entity.TrackEntity;

import java.util.List;

@Repository
public interface TrackRepository extends CrudRepository<TrackEntity , Long> {
    List<TrackEntity> findAll();
}
