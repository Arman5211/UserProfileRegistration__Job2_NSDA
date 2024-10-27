package com.example.userprofileregistration__dipti_ict_amad_l4_04_21

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21

class LoadingActivity_DIPTI_ICT_AMAD_L4_04_21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_dipti_ict_amad_l4_04_21)

        Handler(Looper.getMainLooper()).postDelayed({

            val tergetActivityName = intent.getStringExtra("TARGET_ACTIVITY")
            val userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_DIPTI_ICT_AMAD_L4_04_21?

            val targetIntent = Intent()
            targetIntent.setClassName(this,tergetActivityName ?: return@postDelayed )
            userProfile?.let {
                targetIntent.putExtra("USER_PROFILE",it)
            }
            startActivity(targetIntent)
            finish()
        },3000)
    }
}
