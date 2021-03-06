package com.lmig.model;

import java.util.List;

public class Reservation {

    Long reservationId;
    List<Person> guestDetails;
    SearchAvailableRoomsCommandModel reservationDetails;
    String promoCode;
    Long billId;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public List<Person> getGuestDetails() {
        return guestDetails;
    }

    public void setGuestDetails(List<Person> guestDetails) {
        this.guestDetails = guestDetails;
    }

    public SearchAvailableRoomsCommandModel getReservationDetails() {
        return reservationDetails;
    }

    public void setReservationDetails(SearchAvailableRoomsCommandModel reservationDetails) {
        this.reservationDetails = reservationDetails;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }
}
