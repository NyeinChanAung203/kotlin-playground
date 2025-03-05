class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

object StudentProgress {
    val total: Int = 10
    val answered: Int = 3
}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // like static, but different
    companion object StudentProgress {
        val total: Int = 10
        val answered: Int = 3
    }

    //
    override val progressText: String
        get() = "$answered of $total answered."

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }


//fun printQuiz() {
//    println(question1.questionText)
//    println(question1.answer)
//    println(question1.difficulty)
//    println()
//    println(question2.questionText)
//    println(question2.answer)
//    println(question2.difficulty)
//    println()
//    println(question3.questionText)
//    println(question3.answer)
//    println(question3.difficulty)
//    println()
//}
    // let can access the properties
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

// Extension
// Extension properties can't store data, so they must be get-only.
val Quiz.StudentProgress.progressText: String
    get() = "${Quiz.answered} of ${Quiz.total} answered."

// Extension method
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}

// Rewrite extension functions using interfaces
// An interface is a contract
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
    println(Quiz.progressText)
    println()
    Quiz.printProgressBar()
    println()
    Quiz().printProgressBar()

    val quiz = Quiz()
    quiz.printQuiz()
    quiz.apply {
        printQuiz()
    }
    Quiz().apply {
        printQuiz()
    }
    // let and apply are called scope functions
}
