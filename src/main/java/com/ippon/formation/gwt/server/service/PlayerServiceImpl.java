package com.ippon.formation.gwt.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ippon.formation.gwt.server.domain.dao.PlayerDao;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao dao;

    @Override
    @Transactional(readOnly = true)
    public PlayerEntity findPlayer(String name) {
        return dao.findPlayer(name);
    }

    @Override
    @Transactional
    public void addPlayer(PlayerEntity player) {
        dao.addPlayer(player);
    }

    @Override
    @Transactional
    public void updatePlayer(PlayerEntity player) {
        dao.updatePlayer(player);
    }

    @Override
    @Transactional(readOnly = true)
    public PlayerEntity findPlayer(Long id) {
        return dao.findPlayer(id);
    }
}
