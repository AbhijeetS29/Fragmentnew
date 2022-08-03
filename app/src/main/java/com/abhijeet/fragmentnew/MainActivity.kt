package com.abhijeet.fragmentnew

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var firstFragments: FirstFragments
    lateinit var firstInterface: firstInterface
   var i=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var alertdialog = AlertDialog.Builder(this)
            alertdialog.setCancelable(false)
            alertdialog.setTitle("color_change")
            alertdialog.setMessage("choose a color")
            alertdialog.setPositiveButton("Red") { _, _ ->
                firstInterface.Red()
                Toast.makeText(this, "Color_changed", Toast.LENGTH_SHORT).show()

            }
            alertdialog.setNegativeButton("blue") { _, _ ->
                firstInterface.Blue()
                Toast.makeText(this, "Color_changed", Toast.LENGTH_SHORT).show()
            }
            alertdialog.setNeutralButton("cream"){_,_->
                firstInterface.Cream()
                Toast.makeText(this ,"Color_changed", Toast.LENGTH_SHORT).show()
            }.show()

        }

    }
    fun counter():Int{
        i++
        return i
    }
}



