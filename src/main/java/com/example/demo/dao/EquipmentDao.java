package com.example.demo.dao;

import com.example.demo.entity.Equipment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EquipmentDao {
    private List<Equipment> equipment;

    public EquipmentDao() {
        this.equipment = new ArrayList<>();
        equipment.add(Equipment.builder()
                .id(1)
                .cardId(1)
                .name("Equipment")
                .build());
    }

    public List<Equipment> getByCardId(int id) {
        return equipment.stream().filter(item -> item.getCardId() == id).collect(Collectors.toList());
    }

    public List<Equipment> getAll(){
        return equipment;
    }

    public List<Equipment> save(List<Equipment> _equipment){
        equipment.addAll(_equipment);
        return equipment;
    }
}
