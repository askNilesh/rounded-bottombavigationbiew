package com.asknilesh.roundedbottomnavigationview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radius = resources.getDimension(R.dimen.roundcorner)
        val navViewBackground = bottomNavigationView.getBackground() as MaterialShapeDrawable
        navViewBackground.shapeAppearanceModel = navViewBackground.shapeAppearanceModel
            .toBuilder()
            .setTopRightCorner(CornerFamily.ROUNDED, radius)
            .setTopLeftCorner(CornerFamily.ROUNDED, radius)
            .build()

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> Toast.makeText(
                    this@MainActivity,
                    "HOME",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.action_favorite -> Toast.makeText(
                    this@MainActivity,
                    "Favorites",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.action_cart -> Toast.makeText(
                    this@MainActivity,
                    "CART",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.action_profile -> Toast.makeText(
                    this@MainActivity,
                    "PROFILE",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }
}

