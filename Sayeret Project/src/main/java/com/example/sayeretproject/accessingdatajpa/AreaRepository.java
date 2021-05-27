package com.example.sayeretproject.accessingdatajpa;

import com.example.sayeretproject.beans.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
//    Area findByName(String name);

}
