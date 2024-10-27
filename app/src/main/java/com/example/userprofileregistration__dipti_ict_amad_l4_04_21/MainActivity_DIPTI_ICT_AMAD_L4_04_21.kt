package com.example.userprofileregistration__dipti_ict_amad_l4_04_21

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_DIPTI_ICT_AMAD_L4_04_21 : AppCompatActivity() {
    private lateinit var listButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_ict_amad_l4_04_21)

        listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {
            // Start LoadingActivity instead of ProfileListActivity
            val intent = Intent(this, LoadingActivity_DIPTI_ICT_AMAD_L4_04_21::class.java)
            intent.putExtra("TARGET_ACTIVITY", "com.example.userprofileregistration__dipti_ict_amad_l4_04_21.ProfileListActivity_DIPTI_ICT_AMAD_L4_04_21")

            startActivity(intent)
            finish() // Finish MainActivity so the user can't return to it
        }
    }
}