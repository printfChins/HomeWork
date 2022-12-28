package com.example.homework_10_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ed_name = findViewById<EditText>(R.id.ed_name)
        val tv_text = findViewById<TextView>(R.id.tv_text)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btn_scissor = findViewById<RadioButton>(R.id.btn_scissor)
        val btn_mora = findViewById<RadioButton>(R.id.btn_mora)
        val btn_paper = findViewById<RadioButton>(R.id.btn_mora)
        btn_mora.setOnClickListener {
            if(ed_name.length()<1)
                tv_text.text = "請輸入玩家姓名"
            else{
                tv_name.text = "明子"
            }
        }
    }
}