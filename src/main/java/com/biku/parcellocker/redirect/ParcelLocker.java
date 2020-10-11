package com.biku.parcellocker.redirect;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ParcelLocker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parcelLockerNumber;
    private String shippingBoxNumber;
    private boolean stateOpen;
}
