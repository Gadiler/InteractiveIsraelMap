package com.example.sayeretproject.services.interfaces;

import com.example.sayeretproject.beans.Point;
import com.example.sayeretproject.exceptions.ExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PointService {
    List<Point> getAllPoints() throws ExistException;
    Point getPointById(int pointId)throws ExistException;
}