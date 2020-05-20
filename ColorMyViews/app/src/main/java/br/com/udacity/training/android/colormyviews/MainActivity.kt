package br.com.udacity.training.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(boxOneTextView, boxTwoTextView, boxThreeTextView,
            boxFourTextView, boxFiveTextView, constraintLayout, redBtn, yellowBtn, greenBtn)

        for(item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.boxOneTextView -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoTextView -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.boxThreeTextView -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourTextView -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveTextView -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.redBtn -> boxThreeTextView.setBackgroundResource(R.color.myRed)
            R.id.yellowBtn -> boxFourTextView.setBackgroundResource(R.color.myYellow)
            R.id.greenBtn -> boxFiveTextView.setBackgroundResource(R.color.myGreen)

            else -> {
                view.setBackgroundColor(Color.LTGRAY)
            }

        }
    }

}
