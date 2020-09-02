package com.example.demo.dao;

import com.example.demo.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardDao {
    private List<Card> cards;

    public CardDao() {
        this.cards = new ArrayList<>();
        cards.add(Card.builder()
                .id(1)
                .doctor("John Doe")
                .procedureName("Procedure")
                .build());
        cards.add(Card.builder()
                .id(2)
                .doctor("John")
                .procedureName("Procedure 2")
                .build());
    }

    public Card getById(int id) {
        return cards.stream().filter(item -> item.getId() == id).findFirst()
                .orElse(null);
    }

    public List<Card> getAll() {
        return cards;
    }

    public List<Card> save(Card card){
        cards.add(card);
        return cards;
    }
}
