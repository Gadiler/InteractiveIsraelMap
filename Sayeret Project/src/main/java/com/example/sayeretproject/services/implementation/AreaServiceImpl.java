package com.example.sayeretproject.services.implementation;

import com.example.sayeretproject.accessingdatajpa.AreaRepository;
import com.example.sayeretproject.accessingdatajpa.PointRepository;
import com.example.sayeretproject.beans.Area;
import com.example.sayeretproject.exceptions.ExistException;
import com.example.sayeretproject.services.interfaces.AreaService;
import com.example.sayeretproject.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl extends UserService implements AreaService {


    public AreaServiceImpl(PointRepository pointRepository, AreaRepository areaRepository) {
        super(pointRepository, areaRepository);
    }

//    @Override
//    public Area getAreaByName(String areaName) throws ExistException {
//        return this.areaRepository.findByName(areaName);
//    }

    @Override
    public Area getAreaById(int areaId) throws ExistException {
        return this.areaRepository.findById(areaId).orElseThrow(() -> new ExistException(""));
    }
}
