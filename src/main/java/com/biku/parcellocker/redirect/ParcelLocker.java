package com.biku.parcellocker.redirect;

import lombok.Data;

@Data
public class ParcelLocker {
    private int parcelLockerNumber;
    private String shippingBoxNumber;
    private boolean stateOpen;
}
