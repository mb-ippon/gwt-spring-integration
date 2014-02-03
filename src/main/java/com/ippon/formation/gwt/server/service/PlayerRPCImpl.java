package com.ippon.formation.gwt.server.service;

import java.util.List;

import org.gwtwidgets.server.spring.GWTSpringController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.client.domain.bindery.rpc.PlayerRPC;
import com.ippon.formation.gwt.server.domain.dao.PlayerDao;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;
import com.ippon.formation.gwt.shared.domain.entities.Country;
import com.ippon.formation.gwt.shared.domain.entities.Player;

@Controller
public class PlayerRPCImpl extends GWTSpringController implements PlayerRPC {

    /**
     * 
     */
    private static final long serialVersionUID = 3585045214686215354L;

    @Autowired
    private PlayerDao dao;

    @Autowired
    private PlayerService service;

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
