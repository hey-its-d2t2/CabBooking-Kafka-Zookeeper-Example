package com.deepakKafka.cab_booking_driver.service;

import com.deepakKafka.cab_booking_driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateCabLocation(String cabLocation) {
        kafkaTemplate.send(AppConstant.CAB_LOCATION, cabLocation);
        return true;
    }
}
