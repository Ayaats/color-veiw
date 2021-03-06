package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
   private fun setListeners(){

       val clickableViews : List<View> =
              listOf(box_one_text, box_two_text,box_three_text,box_four_text,box_five_text,constrain_layout
              ,red_bt,green_bt,yelloe_bt)
       for (item in clickableViews){
           item.setOnClickListener { makeColored(it) }
       }
    }
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            // Boxes using custom colors for background
            R.id.red_bt -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yelloe_bt -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_bt -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}