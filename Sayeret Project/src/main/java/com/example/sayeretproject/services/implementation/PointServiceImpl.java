package com.example.sayeretproject.services.implementation;

import com.example.sayeretproject.accessingdatajpa.AreaRepository;
import com.example.sayeretproject.accessingdatajpa.PointRepository;
import com.example.sayeretproject.beans.Point;
import com.example.sayeretproject.exceptions.ExistException;
import com.example.sayeretproject.services.interfaces.PointService;
import com.example.sayeretproject.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointServiceImpl extends UserService implements PointService {


    public PointServiceImpl(PointRepository pointRepository, AreaRepository areaRepository) {
        super(pointRepository, areaRepository);
    }

    @Override
    public List<Point> getAllPoints() {
        return this.pointRepository.findAll();
    }

    @Override
    public Point getPointById(int pointId) throws ExistException {
        return this.pointRepository.findById(pointId).orElseThrow(() -> new ExistException("The point id: " + pointId + " doesn't exist!"));
    }
}
