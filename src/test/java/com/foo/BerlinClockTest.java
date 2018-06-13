package com.foo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockTest {

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void shouldDisplayTenThirtyOneAndEvenSeconds() {

        // given
        String time = "10:31:02";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(true)
                .isFiveHours(true)
                .isTenHours(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayNineThirtyOneAndEvenSeconds() {

        // given
        String time = "09:31:02";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(true)
                .isFiveHours(true)
                .isOneHour(true)
                .isTwoHours(true)
                .isThreeHours(true)
                .isFourHours(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayNineThirtyOneAndOddSeconds() {

        // given
        String time = "09:31:03";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(false)
                .isFiveHours(true)
                .isOneHour(true)
                .isTwoHours(true)
                .isThreeHours(true)
                .isFourHours(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayTwentyFourThirtyOneAndOddSeconds() {

        // given
        String time = "24:31:03";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(false)
                .isFiveHours(true)
                .isTenHours(true)
                .isFifteenHours(true)
                .isTwentyHours(true)
                .isOneHour(true)
                .isTwoHours(true)
                .isThreeHours(true)
                .isFourHours(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayZeroThirtyOneAndOddSeconds() {

        // given
        String time = "00:31:03";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(false)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayZeroOneAndEvenSeconds() {

        // given
        String time = "00:01:02";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayZeroFiftyFiveAndEvenSeconds() {

        // given
        String time = "00:55:02";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isThirtyFiveMinutes(true)
                .isFortyMinutes(true)
                .isFortyFiveMinutes(true)
                .isFiftyMinutes(true)
                .isFiftyFiveMinutes(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayOneThirtyOneAndOddSeconds() {

        // given
        String time = "01:31:03";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(false)
                .isOneHour(true)
                .isFiveMinutes(true)
                .isTenMinutes(true)
                .isFifteenMinutes(true)
                .isTwentyMinutes(true)
                .isTwentyFiveMinutes(true)
                .isThirtyMinutes(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }

    @Test
    public void shouldDisplayTwelveOneAndOddSeconds() {

        // given
        String time = "12:01:01";
        ClockDisplay expectedClockDisplay = ClockDisplay.builder()
                .isEvenSecond(false)
                .isFiveHours(true)
                .isTenHours(true)
                .isOneHour(true)
                .isTwoHours(true)
                .isOneMinute(true)
                .build();

        // when
        ClockDisplay actualClockDisplay = berlinClock.displayTime(time);

        //then
        assertThat(actualClockDisplay).isEqualTo(expectedClockDisplay);
    }
}
