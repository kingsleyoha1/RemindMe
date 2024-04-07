package com.kingsley.markerapi.domain.repository;

import com.kingsley.markerapi.domain.entity.Marker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkerRepositoryInterface  extends JpaRepository<Marker, Long> {
}
