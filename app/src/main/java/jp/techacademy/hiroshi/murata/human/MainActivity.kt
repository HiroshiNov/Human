package jp.techacademy.hiroshi.murata.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Taro = Human("Taro",20,"Swimming")
        Taro.say()
        Taro.think()

        var Tom = Human("Tom",40,"Shopping")
        Tom.say()
        Tom.think()
    }
}
