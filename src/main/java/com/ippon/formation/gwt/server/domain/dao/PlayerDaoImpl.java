package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    @PersistenceContext
    EntityManager entityManage;

    @Override
    public List<PlayerEntity> findClassement() {
        List<PlayerEntity> playerEntities = Lists.newArrayList();
        try {
            List<?> players = entityManage.createQuery("select p from Player p").getResultList();
            for (Object p : players) {
                if (p instanceof PlayerEntity) {
                    playerEntities.add((PlayerEntity) p);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return playerEntities;
    }

    @Override
    public PlayerEntity findPlayer(String name) {
        PlayerEntity player = (PlayerEntity) entityManage.createQuery("select p from Player p where p.name = :name")
                .setParameter("name", name).getSingleResult();
        return player;
    }

    @Override
    public PlayerEntity findPlayer(Long id) {
        PlayerEntity player = entityManage.find(PlayerEntity.class, id);
        return player;
    }

    @Override
    public void addPlayer(PlayerEntity player) {
        entityManage.persist(player);
    }

    @Override
    public void updatePlayer(PlayerEntity player) {
        entityManage.merge(player);
    }

}
