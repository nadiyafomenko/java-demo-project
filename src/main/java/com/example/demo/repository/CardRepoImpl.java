package com.example.demo.repository;

import com.example.demo.dao.CardDao;
import com.example.demo.dao.EquipmentDao;
import com.example.demo.dao.InstrumentDao;
import com.example.demo.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepoImpl implements CardRepository {
    private final CardDao cardDao;
    private final InstrumentDao instrumentDao;
    private final EquipmentDao equipmentDao;

    public CardRepoImpl(CardDao cardDao, InstrumentDao instrumentDao, EquipmentDao equipmentDao) {
        this.cardDao = cardDao;
        this.instrumentDao = instrumentDao;
        this.equipmentDao = equipmentDao;
    }

    @Override
    public Card getById(int id) {
        Card card = cardDao.getById(id);
        if (card != null) {
            card.setInstruments(instrumentDao.getByCardId(card.getId()));
            card.setEquipment(equipmentDao.getByCardId(card.getId()));
        }

        return card;
    }
    @Override
    public List<Card> getAll() { return cardDao.getAll(); }

    public List<Card> save(Card card) {
        cardDao.save(card);
        card.setInstruments(instrumentDao.save(card.getInstruments()));
        card.setEquipment(equipmentDao.save(card.getEquipment()));
        return cardDao.getAll();
    }

}
