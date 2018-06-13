package com.foo;

public class BerlinClock {

    public ClockDisplay displayTime(String time) {

        String[] tokens = time.split(":");

        Integer hours   = Integer.valueOf(tokens[0]);
        Integer minutes = Integer.valueOf(tokens[1]);
        Integer seconds = Integer.valueOf(tokens[2]);

        ClockDisplay.ClockDisplayBuilder builder = constructHours(hours);
        builder = constructMinutes(minutes, builder);
        builder = constructSeconds(seconds, builder);

        return builder.build();
    }

    private ClockDisplay.ClockDisplayBuilder constructSeconds(Integer seconds, ClockDisplay.ClockDisplayBuilder builder) {

        boolean isEvenSeconds = (seconds % 2 == 0);

        return builder.isEvenSecond(isEvenSeconds);
    }

    private ClockDisplay.ClockDisplayBuilder constructMinutes(Integer minutes, ClockDisplay.ClockDisplayBuilder builder) {

        builder = constructUpperMinuteRow(minutes, builder);
        builder = constructLowerMinuteRow(minutes, builder);

        return builder;
    }

    private ClockDisplay.ClockDisplayBuilder constructLowerMinuteRow(Integer minutes, ClockDisplay.ClockDisplayBuilder builder) {

        int oneMinuteBlocks = minutes % 5;

        if (oneMinuteBlocks >= 1) {
            builder = builder.isOneMinute(true);
        }

        if (oneMinuteBlocks >= 2) {
            builder = builder.isTwoMinutes(true);
        }

        if (oneMinuteBlocks >= 3) {
            builder = builder.isThreeMinutes(true);
        }

        if (oneMinuteBlocks >= 4) {
            builder = builder.isFourMinutes(true);
        }

        return builder;
    }

    private ClockDisplay.ClockDisplayBuilder constructUpperMinuteRow(Integer minutes, ClockDisplay.ClockDisplayBuilder builder) {

        if (minutes >= 5) {
            builder = builder.isFiveMinutes(true);
        }

        if (minutes >= 10) {
            builder = builder.isTenMinutes(true);
        }

        if (minutes >= 15) {
            builder = builder.isFifteenMinutes(true);
        }

        if (minutes >= 20) {
            builder = builder.isTwentyMinutes(true);
        }

        if (minutes >= 25) {
            builder = builder.isTwentyFiveMinutes(true);
        }

        if (minutes >= 30) {
            builder = builder.isThirtyMinutes(true);
        }

        if (minutes >= 35) {
            builder = builder.isThirtyFiveMinutes(true);
        }

        if (minutes >= 40) {
            builder = builder.isFortyMinutes(true);
        }

        if (minutes >= 45) {
            builder = builder.isFortyFiveMinutes(true);
        }

        if (minutes >= 50) {
            builder = builder.isFiftyMinutes(true);
        }

        if (minutes >= 55) {
            builder = builder.isFiftyFiveMinutes(true);
        }

        return builder;
    }

    private ClockDisplay.ClockDisplayBuilder constructHours(Integer hours) {

        ClockDisplay.ClockDisplayBuilder builder = ClockDisplay.builder();

        builder = constructUpperHoursRow(hours, builder);

        int oneHourBlocks = hours % 5;

        builder = constructLowerHoursRow(builder, oneHourBlocks);

        return builder;
    }

    private ClockDisplay.ClockDisplayBuilder constructLowerHoursRow(ClockDisplay.ClockDisplayBuilder builder, int oneHourBlocks) {

        if (oneHourBlocks >= 1) {
            builder = builder.isOneHour(true);
        }

        if (oneHourBlocks >= 2) {
            builder = builder.isTwoHours(true);
        }

        if (oneHourBlocks >= 3) {
            builder = builder.isThreeHours(true);
        }

        if (oneHourBlocks >= 4) {
            builder = builder.isFourHours(true);
        }

        return builder;
    }

    private ClockDisplay.ClockDisplayBuilder constructUpperHoursRow(Integer hours, ClockDisplay.ClockDisplayBuilder builder) {

        if (hours >= 5) {
            builder = builder.isFiveHours(true);
        }

        if (hours >= 10) {
            builder = builder.isTenHours(true);
        }

        if (hours >= 15) {
            builder = builder.isFifteenHours(true);
        }

        if (hours >= 20) {
            builder = builder.isTwentyHours(true);
        }

        return builder;
    }
}
