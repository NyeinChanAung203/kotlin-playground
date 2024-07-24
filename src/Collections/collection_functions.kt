package Collections

import java.util.*

fun main(){
    // zipping
    val colors = listOf("blue","red","yellow")
    val animals = listOf("fox","frog","fish")

    println( colors.zip(animals))
    println( colors.zip(animals){color,animal -> "The ${animal.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    }} is $color"})
    println()

    // unzip
    val userInfo = mapOf("name" to "Nyein", "age" to 24)
    println(userInfo)
    val numberPairs = listOf("one" to 1,"two" to 2,"three" to 3)
    println(numberPairs)
    println(numberPairs.unzip())
    println()

    // map vs associateWith
    println(colors.map { it.length })
    println(colors.associateWith { it.length })
    println(colors.associateBy { it.first().uppercase() })
    println()

    // flatten
    val numberSets = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    println(numberSets)
    println(numberSets.flatten())
    println()

    println(colors.joinToString { it})
    println(colors.joinToString("|","Start: "," :End"))
    val listColor = StringBuffer("The list of color: ")
    println(colors.joinTo(listColor))
    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 15, truncated = "..., ${numbers.size}"))
    println()

    println(numbers.filter { it % 10 == 0 })
    println(numbers.filterIndexed{ index: Int, i: Int -> (index+i) %5 == 0  })
    println(numbers.filterNot { i: Int -> i % 11 != 0  })
    println(numbers.any { it / 2 == 0 })
    println(numbers.none { it / 2 == 0 })
    println(numbers.all { it / 2 == 0 })
    println()


    val numberString = listOf("one","two","three","four","five","six")
    println(numberString.groupBy { it.first().uppercase() })
    println(numberString.groupBy(keySelector = {it.first().uppercase()}, valueTransform = {it.uppercase()}))

    println(numbers.slice(1..3))
    println(numbers.slice(1..5 step  2))
    println(numbers.slice(setOf(1,4,0))) // list of index

    println()
    println(numbers.take(5))
    println(numbers.takeLast(5))
    println(numbers.drop(95))
    println(numbers.dropLast(95))

    println()
    println(numberString)
    println(numberString.takeWhile { !it.startsWith("f") })
    println(numberString.takeLastWhile { !it.startsWith("t") })
    println(numbers.chunked(3))
    println(numbers.chunked(10){it.sum()})
    println(numbers.windowed(3))



}