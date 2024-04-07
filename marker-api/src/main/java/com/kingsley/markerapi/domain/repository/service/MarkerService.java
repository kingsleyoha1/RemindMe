package com.kingsley.markerapi.domain.repository.service;

import com.kingsley.markerapi.domain.entity.Marker;
import com.kingsley.markerapi.domain.repository.MarkerRepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MarkerService {
    private final MarkerRepositoryInterface repository;

    @Transactional(readOnly = true)
   public List<Marker> getMarkers(){
        return repository.findAll();
    }


}