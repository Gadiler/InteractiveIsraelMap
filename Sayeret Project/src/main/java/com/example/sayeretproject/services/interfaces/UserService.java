package com.example.sayeretproject.services.interfaces;

import com.example.sayeretproject.accessingdatajpa.AreaRepository;
import com.example.sayeretproject.accessingdatajpa.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class UserService {
    protected final PointRepository pointRepository;
    protected final AreaRepository areaRepository;
}
