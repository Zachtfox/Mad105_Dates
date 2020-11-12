import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main(){
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    var day: Int = 31
    var month: Int = 10
    val pattern = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    val formattedToday = today.format(pattern)

    //starting point is the last full moon: Halloween 10.31.2020
    val lastFullMoon: LocalDate = LocalDate.of(year,month,day)
    val nextFullMoon: LocalDate = lastFullMoon.plusDays(29)
    val nextFullMoonCoverage: LocalDate = lastFullMoon.plusDays(30)

    //full moons occur roughly 29.5 days so I will add 29 and 30 days to get an estimate of the next full moon which falls on November 30th
    val FullMoon = nextFullMoon.format(pattern)
    val FullMoon2 = nextFullMoonCoverage.format(pattern)

    println("Today is $formattedToday")
    println("The last full moon was on Halloween")
    println("The next full moon should be between $FullMoon and $FullMoon2")
}