package com.ippon.formation.gwt.server.domain.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.web.bindery.requestfactory.shared.Locator;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;
import com.ippon.formation.gwt.server.service.CountryService;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CountryLocator extends Locator<CountryEntity, Long> {

    @Autowired
    CountryService service;

    @Override
    public CountryEntity create(Class<? extends CountryEntity> clazz) {
        return new CountryEntity();
    }

    @Override
    public CountryEntity find(Class<? extends CountryEntity> clazz, Long id) {
        return service.findCountry(id);
    }

    @Override
    public Class<CountryEntity> getDomainType() {
        return CountryEntity.class;
    }

    @Override
    public Long getId(CountryEntity domainObject) {
        return domainObject.getId();
    }

    @Override
    public Class<Long> getIdType() {
        return Long.class;
    }

    @Override
    public Object getVersion(CountryEntity domainObject) {
        return domainObject.getVersion();
    }

}
