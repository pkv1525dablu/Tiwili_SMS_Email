package com.twilio.payload;

import lombok.Data;

@Data
public class EmailRequest {

    private String toEmail;
    private String subject;
    private String content;

    // getters and setters


}
