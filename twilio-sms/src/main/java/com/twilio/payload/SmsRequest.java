package com.twilio.payload;

import lombok.Data;
@Data
public class SmsRequest {

    private String toPhoneNumber;
    private String message;

    // getters and setters

}
