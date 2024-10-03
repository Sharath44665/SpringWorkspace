package com.sharath.jpa.repositories;

import com.sharath.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
