package com.anwesh.uiprojects.linkedthreehorzbarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.threehorzbarview.ThreeHorzBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThreeHorzBarView.create(this)
    }
}
