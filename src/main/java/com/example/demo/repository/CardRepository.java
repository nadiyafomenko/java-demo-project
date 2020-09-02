package com.example.demo.repository;

import com.example.demo.entity.Card;

import java.util.List;

public interface CardRepository {

    Card getById(int id);

    List<Card> getAll();

    List<Card> save(Card card);
}
