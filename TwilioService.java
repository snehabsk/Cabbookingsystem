package org.demoProject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioService {

//    @Value("${twilio.accountSid}")
    private String accountSid = "AC83ee6e7b981acb8c75c1c64643998c5f";

//    @Value("${twilio.authToken}")
    private String authToken = "5dd02f5d8b2f27fdf2f84382e8d15ddc";

    public Message sendSms(String to, String message) {
    	Message msg = null;
        try {
        	Twilio.init(accountSid, authToken);
             msg = Message.creator(new PhoneNumber(to), new PhoneNumber("++16184861593"), message).create();
		} catch (Exception e) {
			System.out.println("Twilio failed");
		}
        return msg;
    }
}