package com.example.hw4_3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            //驗證發出對象，
            if(requestCode==1 && resultCode == Activity.RESULT_OK){
                val value_drink = it.getString("drinkname")
                val a1_drink = findViewById<TextView>(R.id.a1_drink)
                a1_drink.text = "飲料：${value_drink}"

                val value_suger = it.getString("suger")
                val a1_suger = findViewById<TextView>(R.id.a1_suger)
                a1_suger.text = " 甜度：${value_suger}"

                val value_ice = it.getString("ice")
                val a1_ice = findViewById<TextView>(R.id.a1_ice)
                a1_ice.text = "冰度：${value_ice}"

                val value_money  = it.getString("money")
                val a1_money = findViewById<TextView>(R.id.a1_money)
                a1_money.text = "價格：${value_money}"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a1_order_btn = findViewById<Button>(R.id.a1_order_btn)
        a1_order_btn.setOnClickListener{
            val i = Intent(this,MainActivity2::class.java)
            @Suppress("DEPRECATION")
            startActivityForResult(i,1)
        }
    }
}