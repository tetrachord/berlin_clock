package com.foo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder=true)
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class ClockDisplay {

    private boolean isEvenSecond;

    private boolean isFiveHours;
    private boolean isTenHours;
    private boolean isFifteenHours;
    private boolean isTwentyHours;

    private boolean isOneHour;
    private boolean isTwoHours;
    private boolean isThreeHours;
    private boolean isFourHours;

    private boolean isFiveMinutes;
    private boolean isTenMinutes;
    private boolean isFifteenMinutes;
    private boolean isTwentyMinutes;
    private boolean isTwentyFiveMinutes;
    private boolean isThirtyMinutes;
    private boolean isThirtyFiveMinutes;
    private boolean isFortyMinutes;
    private boolean isFortyFiveMinutes;
    private boolean isFiftyMinutes;
    private boolean isFiftyFiveMinutes;

    private boolean isOneMinute;
    private boolean isTwoMinutes;
    private boolean isThreeMinutes;
    private boolean isFourMinutes;
}
