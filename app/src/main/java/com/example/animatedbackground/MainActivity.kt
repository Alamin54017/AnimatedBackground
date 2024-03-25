package com.example.animatedbackground

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var constraint:ConstraintLayout=findViewById(R.id.constraint)

        var animdraw: AnimationDrawable= constraint.getBackground() as AnimationDrawable
        animdraw.setEnterFadeDuration(2500)
        animdraw.setExitFadeDuration(5000)
        animdraw.start()
    }
}