package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.DisplayNameSources
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bnBackspace = findViewById<LinearLayout>(R.id.bnbackspace)
        val btnAc = findViewById<TextView>(R.id.bnAC)
        val bnMulti = findViewById<TextView>(R.id.bnmultiply)
        val bnbraces = findViewById<TextView>(R.id.bnBraces)
        val bndivide = findViewById<TextView>(R.id.bndivide)
        val bnpercentage = findViewById<TextView>(R.id.bnPercent)
        val bnAdd = findViewById<TextView>(R.id.bnAdd)
        val bnsub = findViewById<TextView>(R.id.bnSubt)
        val bnequal = findViewById<TextView>(R.id.bnequal)
        val bndot = findViewById<TextView>(R.id.bndot)
        val bnpower = findViewById<TextView>(R.id.bnpower)
        val bn0 = findViewById<TextView>(R.id.bn0)
        val bn1 = findViewById<TextView>(R.id.bn1)
        val bn2 = findViewById<TextView>(R.id.bn2)
        val bn3 = findViewById<TextView>(R.id.bn3)
        val bn4 = findViewById<TextView>(R.id.bn4)
        val bn5 = findViewById<TextView>(R.id.bn5)
        val bn6 = findViewById<TextView>(R.id.bn6)
        val bn7 = findViewById<TextView>(R.id.bn7)
        val bn8 = findViewById<TextView>(R.id.bn8)
        val bn9 = findViewById<TextView>(R.id.bn9)
        val Displays = findViewById<TextView>(R.id.tvDisplay)

        var displayble = mutableListOf<Any>()

        var operate: String = ""
        var percent: String = ""


        val tempValue: MutableList<Any> = mutableListOf()
        val tempValue2: MutableList<Any> = mutableListOf()
        //



        bn0.setOnClickListener {
            if (operate.isEmpty()) {
                if (tempValue.isNotEmpty()) {
                    tempValue += 0
                    displayble += 0
                    Displays.text = displayble.joinToString("")
                }
            }
            else
                {
                    tempValue2 += 0
                    displayble += 0
                    Displays.text = displayble.joinToString("")
                }
            }
        bn1.setOnClickListener {
            if (operate.isEmpty()) {
                    tempValue += 1
                    displayble += 1
                    Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 1
                displayble += 1
                Displays.text = displayble.joinToString("")
            }
        }
        bn2.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 2
                displayble += 2
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 2
                displayble += 2
                Displays.text = displayble.joinToString("")
            }
        }
        bn3.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 3
                displayble += 3
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 3
                displayble += 3
                Displays.text = displayble.joinToString("")
            }
        }
        bn4.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 4
                displayble += 4
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 4
                displayble += 4
                Displays.text = displayble.joinToString("")
            }
        }
        bn5.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 5
                displayble += 5
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 5
                displayble += 5
                Displays.text = displayble.joinToString("")
            }
        }
        bn6.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 6
                displayble += 6
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 6
                displayble += 6
                Displays.text = displayble.joinToString("")
            }
        }
        bn7.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 7
                displayble += 7
                Displays.text = displayble.joinToString("")
            }
            else
            {
                tempValue2 += 7
                displayble += 7
                Displays.text = displayble.joinToString("")
            }
        }
        bn8.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 8
                displayble += 8
                Displays.text = displayble.joinToString("")
            }
            else{
                tempValue2 += 8
                displayble += 8
                Displays.text = displayble.joinToString("")
            }
        }
        bn9.setOnClickListener {
            if (operate.isEmpty()) {
                tempValue += 9
                displayble += 9
                Displays.text = displayble.joinToString("")
            }
            else{
                tempValue2 += 9
                displayble += 9
                Displays.text = displayble.joinToString("")
            }
        }
        //clear and equal
        btnAc.setOnClickListener {
            tempValue.clear()
            tempValue2.clear()
            displayble.clear()
            operate = ""
            Displays.text = "0"
        }
        bnequal.setOnClickListener {
            if (tempValue.isNotEmpty() && tempValue2.isNotEmpty() && operate != "") {
                val values1: Int = tempValue.joinToString("").toInt()
                val values2: Int = tempValue2.joinToString("").toInt()

                val calculate: String = if (percent != "%") {
                    when (operate) {
                        "+" -> (values1 + values2).toString()
                        "-" -> (values1 - values2).toString()
                        "x" -> (values1 * values2).toString()
                        "/" -> (values1.toFloat() / values2.toFloat()).toString()
                        "^" -> (values1.toFloat().pow(values2.toFloat())).toString()
                        else -> "logic Error"
                    }
                } else {
                    when (operate) {
                        "+" -> ( values1.toFloat() + (values1.toFloat() * values2.toFloat()) / 100 ).toString()
                        "-" -> (values1.toFloat() - ((values1.toFloat() / 100) * values2.toFloat())).toString()
                        else -> "logic Error"
                    }
                }
                Displays.text = "${displayble.joinToString("")} \n $calculate"
                tempValue.clear()
                tempValue2.clear()
                displayble.clear()
                operate = ""
                percent = ""
                }
            }
        bnBackspace.setOnClickListener{
            if (tempValue.isNotEmpty() && tempValue2.isEmpty()){
                if(operate != "") {
                    operate = ""
                }
                if (tempValue[0] != 0) {
                    tempValue.removeAt(tempValue.size - 1)
                }
                displayble.removeAt(displayble.size - 1)
                Displays.text = displayble.joinToString("")
            }
            if(tempValue2.isNotEmpty()){
                tempValue2.removeAt(tempValue2.size - 1)
                displayble.removeAt(displayble.size - 1)
                Displays.text = displayble.joinToString("")
            }
        }
        //operator
        bnAdd.setOnClickListener {
            if (tempValue.isNotEmpty() && operate.isEmpty()) {
                operate = "+"
                displayble += " + "
                Displays.text = displayble.joinToString("")
            }
        }
        bnsub.setOnClickListener {
            if (tempValue.isNotEmpty() && operate.isEmpty()) {
                operate = "-"
                displayble += " - "
                Displays.text = displayble.joinToString("")
            }
        }
        bndivide.setOnClickListener {
            if (tempValue.isNotEmpty() && operate.isEmpty()) {
                operate = "/"
                displayble += " / "
                Displays.text = displayble.joinToString("")
            }
        }
        bnpower.setOnClickListener {
            if (tempValue.isNotEmpty() && operate.isEmpty()) {
            operate = "^"
            displayble += " ^ "
            Displays.text = displayble.joinToString("")
            }
        }
        bnMulti.setOnClickListener {
            if (tempValue.isNotEmpty() && operate.isEmpty()) {
                operate = "x"
                displayble += " x "
                Displays.text = displayble.joinToString("")

            }
        }
        bnpercentage.setOnClickListener {
            if (operate != "" && tempValue.isNotEmpty() && tempValue2.isNotEmpty()) {
                percent = "%"
                displayble += " % "
                Displays.text = displayble.joinToString("")
            }
        }
        bnbraces.setOnClickListener {
            Toast.makeText(this@MainActivity, "Soon this feature will be added", Toast.LENGTH_SHORT).show()
        }
        bndot.setOnClickListener {
            Toast.makeText(this@MainActivity, "Soon this feature will be added", Toast.LENGTH_SHORT).show()
        }


    }
}