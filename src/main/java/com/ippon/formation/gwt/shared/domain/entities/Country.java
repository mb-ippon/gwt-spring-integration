package com.ippon.formation.gwt.shared.domain.entities;

import java.io.Serializable;

public class Country implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -868453583880327320L;

    private final String code;
    private final String libelle;

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
