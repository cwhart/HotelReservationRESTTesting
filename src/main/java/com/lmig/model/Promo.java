package com.lmig.model;

import java.time.LocalDate;

public class Promo {

    Long id;
    PromoType promoType;
    LocalDate startDate;
    LocalDate endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PromoType getPromoType() {
        return promoType;
    }

    public void setPromoType(PromoType promoType) {
        this.promoType = promoType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
