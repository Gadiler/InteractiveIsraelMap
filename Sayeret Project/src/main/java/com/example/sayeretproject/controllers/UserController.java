package com.example.sayeretproject.controllers;

import com.example.sayeretproject.exceptions.ExistException;
import com.example.sayeretproject.services.interfaces.AreaService;
import com.example.sayeretproject.services.interfaces.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("point")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final PointService pointService;
    private final AreaService areaService;

    @GetMapping(path = "/getAllPoints", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAllPoints() throws ExistException {
        return new ResponseEntity<>(this.pointService.getAllPoints(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/getPointById", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getPointById(int pointId) throws ExistException {
        return new ResponseEntity<>(this.pointService.getPointById(pointId), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/getAreaById/", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getAreaById(int areaId) throws ExistException {
        return new ResponseEntity<>(this.areaService.getAreaById(areaId), HttpStatus.ACCEPTED);
    }
}
