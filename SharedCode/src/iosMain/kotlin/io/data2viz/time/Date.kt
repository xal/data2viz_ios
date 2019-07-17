package io.data2viz.time

import platform.Foundation.NSDate
import platform.darwin.Duration


//val utc = ZoneOffset.UTC
val UNIX_TIME = date(1970)
val milliToNano = 1000000


actual class Date {

    private var date: NSDate = NSDate()

    actual constructor() {
        date = NSDate()
    }

    private constructor(localDate: NSDate) {
        date = localDate
    }

    actual constructor(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, millisecond: Int) {
//        error("Not implemented")
        //date = NSDate.of(year, month, day, hour, minute, second, millisecond * milliToNano)
    }

    actual constructor(date: Date) {
        this.date = date.date
    }

    actual override fun toString():String = date.toString()

    actual fun minusMilliseconds(milliseconds: Int): Date {
        error("Not implemented")
//        return Date(date.minus(milliseconds.toLong(), ChronoUnit.MILLIS))
    }

    actual fun isBefore(otherDate: Date): Boolean {
        error("Not implemented")
//        date.isBefore(otherDate.date)
    }

    actual fun millisecondsBetween(otherDate: Date): Long = error("Not implemented")
    actual fun daysBetween(otherDate: Date): Long = error("Not implemented")
    actual fun hoursBetween(otherDate: Date): Long = error("Not implemented")

    private fun durationBetween(otherDate: Date): Duration {
        error("Not implemented")
//        return Duration.between(date, otherDate.date)
    }

    actual fun getTimezoneOffset(): Int = 0

    actual fun plusMilliseconds(milliseconds: Long) {
        error("Not implemented")
//        date = date.plus(milliseconds, ChronoUnit.MILLIS)
    }
//    actual fun plusSeconds(seconds:Long) { date = date.plusSeconds(seconds) }
//    actual fun plusMinutes(minutes:Long) { date = date.plusMinutes(minutes) }
    actual fun plusHours(hours:Long) { date = error("Not implemented")}
    actual fun plusDays(days:Long) { date = error("Not implemented")}
    actual fun plusMonths(months:Long) { date = error("Not implemented")}
    actual fun plusYears(years:Long) { date = error("Not implemented")}

    actual fun setMillisecond(millisecond: Int) {
        error("Not implemented")
//        date = date.withNano(millisecond * milliToNano)
    }

    actual fun setSecond(second: Int) {
        error("Not implemented")
//        date = date.withSecond(second)
    }

    actual fun setMinute(minute: Int) {
        error("Not implemented")
//        date = date.withMinute(minute)
    }

    actual fun setHour(hour: Int) {
        error("Not implemented")
//        date = date.withHour(hour)
    }

    actual fun setDayOfMonth(day: Int) {
        error("Not implemented")
//        date = date.withDayOfMonth(day)
    }

    actual fun setMonth(month: Int) {
        error("Not implemented")
//        date = date.withMonth(month)
    }

    actual fun setFullYear(year: Int) {
        error("Not implemented")
//        date = date.withYear(year)
    }

    actual fun millisecond(): Int = error("Not implemented")
    actual fun second(): Int = error("Not implemented")
    actual fun minute(): Int = error("Not implemented")
    actual fun hour(): Int = error("Not implemented")
    actual fun dayOfWeek(): Int = error("Not implemented")
    actual fun dayOfMonth(): Int = error("Not implemented")
    actual fun dayOfYear(): Int = error("Not implemented")
    actual fun month(): Int = error("Not implemented")
    actual fun year(): Int = error("Not implemented")

    actual fun getTime():Double = UNIX_TIME.millisecondsBetween(this).toDouble()
}
