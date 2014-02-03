package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Repository
public class CountryDaoImpl implements CountryDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<CountryEntity> findCountries() {
        List<CountryEntity> countryEntities = Lists.newArrayList();
        List<?> countries = entityManager.createQuery("select c from Country c").getResultList();
        for (Object c : countries) {
            if (c instanceof CountryEntity) {
                countryEntities.add((CountryEntity) c);
            }
        }
        return countryEntities;
    }

    @Override
    public CountryEntity findCountry(Long id) {
        return entityManager.find(CountryEntity.class, id);
    }

}
