package testscala.time.calendar

import java.util.{TimeZone, Calendar}

/**
  * Created by sijiansheng on 2016/10/12.
  */
object TestCalendar {

  def main(args: Array[String]) {

    val calendar = Calendar.getInstance()
    val hour = calendar.get(Calendar.HOUR_OF_DAY)
    val day = calendar.get(Calendar.DAY_OF_WEEK)
    val day1 = calendar.get(Calendar.DAY_OF_MONTH)
    val moth = calendar.get(Calendar.MONTH)
    val year = calendar.get(Calendar.YEAR)
    val timeMillis = calendar.getTimeInMillis/1000/60*60
    println(calendar)
    println(s"day:$day")
    println(s"day1:$day1")
    println(hour)
    calendar.set(Calendar.HOUR_OF_DAY, 11)
    println(calendar.get(Calendar.HOUR_OF_DAY))
    println(calendar.getTime)
    println(moth)
    println(year.toString)
    println(s"timeMillis:$timeMillis")
    val timeStampCal = Calendar.getInstance
    val timeStamp = 1483056762000L//2016-12-30 08:12:42
    timeStampCal.setTimeInMillis(timeStamp)
    println(s"timeStampHour:${timeStampCal.get(Calendar.HOUR_OF_DAY)}")
    println(s"timeStampMinute:${timeStampCal.get(Calendar.MINUTE)}")
  }
}
