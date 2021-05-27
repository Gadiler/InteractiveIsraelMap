package com.example.sayeretproject.beans;

import lombok.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Points")
@Builder
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String areaId;
    private String imagesPath;
    private String lmHeight;
    private String lmWidth;
}
