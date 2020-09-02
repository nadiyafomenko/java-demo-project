package com.example.demo.dao;

import com.example.demo.entity.Instrument;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InstrumentDao {
    private List<Instrument> instruments;

    public InstrumentDao() {
        this.instruments = new ArrayList<>();
        instruments.add(Instrument.builder()
                .id(1)
                .cardId(1)
                .name("Instrument")
                .build());
        instruments.add(Instrument.builder()
                .id(2)
                .cardId(2)
                .name("Instrument2")
                .build());
    }

    public List<Instrument> getByCardId(int id) {
        return instruments.stream().filter(item -> item.getCardId() == id).collect(Collectors.toList());
    }
    public List<Instrument> getAll(){
        return instruments;
    }

    public List<Instrument> save(List<Instrument> instrument) {
        instruments.addAll(instrument);
        return instruments;
    }
}
