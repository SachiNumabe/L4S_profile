package com.example.l4s_profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            proflieImage.setImageResource(R.drawable.randy_image)
            profileLabelText.text = "名前"
            proflieCommentText.text = "Androidメンターのランディだよ"

            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180, 220))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
        }
        button2.setOnClickListener {
            proflieImage.setImageResource(R.drawable.baseball_image)
            profileLabelText.text = "スポーツ"
            proflieCommentText.text = "野球観戦が好きで、スタジアムに通っている"

            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0, 100))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
        }
        button3.setOnClickListener {
            proflieImage.setImageResource(R.drawable.donut_image)
            profileLabelText.text = "好きな食べ物"
            proflieCommentText.text = "キャンディやドーナツが大好き"

            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180, 120))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))

        }
        button4.setOnClickListener {
            proflieImage.setImageResource(R.drawable.gadget_image)
            profileLabelText.text = "趣味"
            proflieCommentText.text = "ガジェットを集めて動かすこと"

            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150, 150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100, 0))

        }
    }
}
