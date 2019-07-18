package com.lmig.model;

public class PromoType {

    Long id;
    PromoRate promoRate;
    String promoCode;
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PromoRate getPromoRate() {
        return promoRate;
    }

    public void setPromoRate(PromoRate promoRate) {
        this.promoRate = promoRate;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
