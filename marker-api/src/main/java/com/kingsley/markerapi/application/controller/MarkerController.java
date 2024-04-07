package com.kingsley.markerapi.application.controller;

import com.kingsley.markerapi.domain.repository.service.MarkerService;
import com.kingsley.markerapi.domain.entity.Marker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/markers")
@RequiredArgsConstructor

public class MarkerController {

    private final MarkerService markerService;
    @GetMapping
    public List<Marker> getMarkers(){
        return markerService.getMarkers();
    }

}