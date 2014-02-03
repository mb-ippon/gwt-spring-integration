package com.ippon.formation.gwt.shared.domain.entities;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Country implements IsSerializable {

    private String code;
    private String libelle;

    public Country() {
    }

    public Country(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Country other = (Country) obj;
        if (code == null) {
            if (other.code != null) {
                return false;
            }
        }
        else if (!code.equals(other.code)) {
            return false;
        }
        return true;
    }

}
