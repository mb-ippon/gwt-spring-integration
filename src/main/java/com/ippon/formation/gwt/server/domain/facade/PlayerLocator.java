package com.ippon.formation.gwt.server.domain.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.web.bindery.requestfactory.shared.Locator;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;
import com.ippon.formation.gwt.server.service.PlayerService;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PlayerLocator extends Locator<PlayerEntity, Long> {

    @Autowired
    PlayerService service;

    @Override
    public PlayerEntity create(Class<? extends PlayerEntity> clazz) {
        return new PlayerEntity();
    }

    @Override
    public PlayerEntity find(Class<? extends PlayerEntity> clazz, Long id) {
        return service.findPlayer(id);
    }

    @Override
    public Class<PlayerEntity> getDomainType() {
        return PlayerEntity.class;
    }

    @Override
    public Long getId(PlayerEntity domainObject) {
        return domainObject.getId();
    }

    @Override
    public Class<Long> getIdType() {
        return Long.class;
    }

    @Override
    public Object getVersion(PlayerEntity domainObject) {
        return domainObject.getVersion();
    }

}
