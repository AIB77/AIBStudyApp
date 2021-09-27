package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_android.*

class AndroidActivity : AppCompatActivity() {

    private val androidList = arrayListOf<ArrayList<String>>(
        arrayListOf("New Project Setup", "The Steps To Open New Project", "1-opening Android Studio 2-Clicking on Create New Project. 3-choose Empty Activity. 4-Create The Project Name"),
        arrayListOf("the Console", " we can use the console to print information.", "Anything that prints to the console will be invisible to the end-user.."),
        arrayListOf("Design View and XML","Inside activity_main.xml", "Android Studio allows us to design our application with its intuitive drag and drop features and/or by making changes to the XML code..") ,
        arrayListOf("UI Elements","are those components of Android that are used to design the UI in a more interactive way","TextView ,EditText ,Button,RadioGroup,CheckBox,exc"),
        arrayListOf("OnClickListener","Once your button is initialized, we can add an OnClickListener ","myButton.setOnClickListener { myFuction() }")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        title = "Android"

        android_recycler_view.adapter = RecyclerViewAdapter(androidList, this)
        android_recycler_view.layoutManager = LinearLayoutManager(this)
    }
}