package com.example.hw4_3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val a2_go =  findViewById<Button>(R.id.a2_go)
        val a2_suger_group = findViewById<RadioGroup>(R.id.a2_suger_group)
        val a2_ice_group = findViewById<RadioGroup>(R.id.a2_ice_group)
        val a2_drinkname = findViewById<RadioGroup>(R.id.a2_drink_group)
        intent?.extras.let {
            val bundle = Bundle()
            a2_go.setOnClickListener{
                    bundle.putString("sugar", a2_suger_group.findViewById<RadioButton>(a2_suger_group.checkedRadioButtonId).text.toString())
                    bundle.putString("ice", a2_ice_group.findViewById<RadioButton>(a2_ice_group.checkedRadioButtonId).text.toString())
                    if(a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.toString() == "咖啡 40元") {
                        bundle.putString("drinkname",a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.substring(0,2).toString())
                        bundle.putString("money","40")
                    }
                    if(a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.toString() == "紅茶 20元") {
                        bundle.putString("drinkname",a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.substring(0,2).toString())
                        bundle.putString("money","20")
                    }
                    if(a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.toString() == "奶茶 30元") {
                        bundle.putString("drinkname",a2_drinkname.findViewById<RadioButton>(a2_drinkname.checkedRadioButtonId).text.substring(0,2).toString())
                        bundle.putString("money","30")
                    }
                    setResult(RESULT_OK, Intent().putExtras(bundle))
                    finish()
            }
        }
    }
}