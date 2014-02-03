package com.ippon.formation.gwt.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ippon.formation.gwt.client.domain.bindery.rpc.PlayerRPC;
import com.ippon.formation.gwt.server.domain.dao.PlayerDao;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;
import com.ippon.formation.gwt.shared.domain.entities.Country;
import com.ippon.formation.gwt.shared.domain.entities.Player;

public class PlayerRPCImpl extends RemoteServiceServlet implements PlayerRPC {

    /**
     * 
     */
    private static final long serialVersionUID = 3585045214686215354L;

    @Autowired
    private PlayerDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Player> findClassement() {
        List<PlayerEntity> playerEntities = dao.findClassement();
        List<Player> players = Lists.newArrayList();
        for (PlayerEntity input : playerEntities) {
            Country country = new Country(input.getCountry().getCode(), input.getCountry().getLibelle());
            players.add(new Player(input.getName(), input.getHeight(), input.getWeight(), input.getBirthDay(), input
                    .getPlayHand(), input.getYearTurnPro(), input.getAtpPoint(), country));
        }
        return players;
    }
}
