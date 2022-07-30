package com.kamildoescode.springbootbackend;

import java.sql.Timestamp;
import java.time.Clock;

public class Fixture {

    public static Timestamp anUTCTimestamp() {
        return Timestamp.from(Clock.systemUTC().instant());
    }
}
