package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    private val kotlinList = arrayListOf<ArrayList<String>>(
        arrayListOf("Hello World", "Printing 'Hello World' to the console is a fairly straight forward process..", "println 'Hello World' "),
        arrayListOf("val and var","Kotlin requires each variable to be labeled val or var","Variables labeled with the val keyword are immutable, meaning they can not be reassigned later.  On the other hand, variables with the var keyword are mutable and can be changed anytime."),
        arrayListOf("User Input", "Getting user input.", "create a variable that holds the input, then get the user input with readLine()"),
        arrayListOf("Strings", "String concatenations, interpolation, and methods.", "String concatenation refers to combining strings (or other data types) with the use of a + sign."),
        arrayListOf("Data Types","Kotlin can infer data types of our variables based on what comes after the equals sign"," Integers, Floats, Strings, and Booleans"),
        arrayListOf("Basic Operations","The Operations are addition, subtraction, multiplication, division, and the modulo operator."," num /= 2  num *= 3 num --"),
        arrayListOf("If Statements","We use if statements to guide our program in the right direction.","If statements can have multiple paths. Using else if and else statements only performs one check, while the above if statements perform three checks."),
        arrayListOf("For Loops","It use To do acthive multiple times","we need something to happen multiple times. Instead of typing the same thing over and over again, we can use loops."),


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        title = "Kotlin"

        kotlin_recycler_view.adapter = RecyclerViewAdapter(kotlinList, this)
        kotlin_recycler_view.layoutManager = LinearLayoutManager(this)
    }

}