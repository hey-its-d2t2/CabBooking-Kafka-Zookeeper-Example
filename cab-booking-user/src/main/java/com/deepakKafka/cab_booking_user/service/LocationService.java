package com.deepakKafka.cab_booking_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {


    @KafkaListener(topics = "Cab-Locations", groupId = "user-group")
    public void cabLocationService(String location) {
        System.out.println("Cab-Locations Service called: "+location);
    }
}
