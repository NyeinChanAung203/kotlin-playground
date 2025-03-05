enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

val Event.durationOfEvent: String
    get() = if(this.durationInMinutes < 60) "short" else "long"

fun main() {
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
        )
    val shortEvents = events.filter {
        it.durationInMinutes < 60
    }
    println("You have ${shortEvents.size} short events.")

    val groupEvent = events.groupBy {
        it.daypart
    }
    groupEvent.forEach { (daypart,events) ->
        println("$daypart: ${events.size} events")
    }
    println("Last event of the day: ${events.last().title}")
}