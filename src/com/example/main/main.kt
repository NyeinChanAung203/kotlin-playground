package com.example.main

import com.example.other.OtherClass
import com.example.test.TestClass

fun main(){
    val test = TestClass("test package")
    val other = OtherClass()

    // main class is not import because it is in the same package
    val mainClass = MainClass()
}