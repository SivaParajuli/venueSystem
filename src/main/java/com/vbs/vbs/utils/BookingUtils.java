package com.vbs.vbs.utils;

import com.vbs.vbs.enums.EventType;
import org.springframework.stereotype.Component;

@Component
public class BookingUtils {

    public EventType getEvent(String event){
        if(event.equals("Marriage")){
            return EventType.MARRIAGE;
        }
        if(event.equals("Conclave")){
            return EventType.CONCLAVE;
        }
        if(event.equals("College Function")){
            return EventType.COLLEGE_EVENT;
        }
        if(event.equals("Annual Meet")){
            return EventType.MARRIAGE;
        }
        if(event.equals("Family Party")){
            return EventType.MARRIAGE;
        }
        return null;
    }

    public Double calculatePayment(Double rate , Double baseCost , Integer requiredCapacity){

        if(requiredCapacity <= 100){
            return baseCost;
        }
        if(requiredCapacity <= 150){
            return (baseCost + (baseCost *rate / 100));
        }
        if(requiredCapacity <= 200){
            return (baseCost + (baseCost * (rate +15) / 100));
        }
        if(requiredCapacity <= 250){
            return (baseCost + (baseCost * (rate +30) / 100));
        }
        if(requiredCapacity <= 300){
            return (baseCost + (baseCost * (rate +40) / 100));
        }
        if(requiredCapacity <= 350){
            return (baseCost + (baseCost * (rate +50) / 100));
        }
        if(requiredCapacity <= 400){
            return (baseCost + (baseCost * (rate +70) / 100));
        }
        if(requiredCapacity <= 450){
            return (baseCost + (baseCost * (rate +90) / 100));
        }
        if(requiredCapacity <= 500){
            return (baseCost + (baseCost * (rate +120) / 100));
        }
        return (baseCost + (baseCost * (rate +200) / 100));
    }
}