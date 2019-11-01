operator fun MyDate.rangeTo(other: MyDate): Nothing =
        MyDate(2015, 5, 11)..MyDate(2016,5,12)

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return first <= date && date <= last
}
