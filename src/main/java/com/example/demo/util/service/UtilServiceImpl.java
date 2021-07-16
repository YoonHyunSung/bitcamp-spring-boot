package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{
    private UtilDTO util = new UtilDTO();
    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }
    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTiome() {
        return String.format("%s %s", today(),currentTime());
    }

    @Override
    public String randomNumbers(int digits, boolean allowZeroVaue) {
        //Math.random() 클래스 메소드
        //Random random = new Random()
        //random.nextInt(1000) 인스턴스 메소드
        /*if (allowZeroVaue){
            first +=((int)(Math.random()*10));
        }else {
            first +=((int)(Math.random()*10));
        }*/
        String first = "", result = "";
        first += allowZeroVaue ? ((int)(Math.random()*10)):((int)(Math.random()*9+1));
        for(int i=0;i<digits; i++){
            result +=(int)(Math.random()*10);
        }
        return first+result;
    }
}
