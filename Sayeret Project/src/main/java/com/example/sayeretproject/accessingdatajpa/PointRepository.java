package com.example.sayeretproject.accessingdatajpa;

import com.example.sayeretproject.beans.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<Point, Integer> {
}
