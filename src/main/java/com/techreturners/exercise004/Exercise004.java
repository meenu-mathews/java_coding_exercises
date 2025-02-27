package com.techreturners.exercise004;

import java.time.*;
import java.time.chrono.ChronoLocalDateTime;

public class Exercise004 {
    static final long GIGASEC = 1000000000;
    LocalDateTime localDateTime;
    public Exercise004(LocalDate date) {
        localDateTime = date.atStartOfDay().plusSeconds(GIGASEC);
    }
    public Exercise004(LocalDateTime dateTime) {
        localDateTime = dateTime.plusSeconds(GIGASEC);
    }
    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}
