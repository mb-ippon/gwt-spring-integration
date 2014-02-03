package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

public interface CountryDao {

    List<CountryEntity> findCountries();

    CountryEntity findCountry(Long id);

}
