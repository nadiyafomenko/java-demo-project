package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card {
    private int id;
    private String procedureName;
    private String doctor;
    private List<Instrument> instruments;
    private List<Equipment> equipment;
}
