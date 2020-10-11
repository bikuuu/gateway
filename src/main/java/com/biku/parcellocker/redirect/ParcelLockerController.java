package com.biku.parcellocker.redirect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ParcelLockerController {

    @PostMapping("/parcellocker")
    public void sendParcelLockerRequest(@RequestBody ParcelLocker parcelLocker) {
        log.info("Parcel Locker: {}", parcelLocker);
    }
}
