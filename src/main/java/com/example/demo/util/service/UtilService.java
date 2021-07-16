package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
public interface UtilService {
    LocalDate today();
    LocalTime currentTime();
    String todayAndCurrentTiome();
    String randomNumbers(int digits, boolean allowZeroValue);
}
