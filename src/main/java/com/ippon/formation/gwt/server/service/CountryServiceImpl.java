package com.ippon.formation.gwt.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ippon.formation.gwt.server.domain.dao.CountryDao;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<CountryEntity> findCountries() {
        return dao.findCountries();
    }

    @Override
    @Transactional(readOnly = true)
    public CountryEntity findCountry(Long id) {
        return dao.findCountry(id);
    }

}
