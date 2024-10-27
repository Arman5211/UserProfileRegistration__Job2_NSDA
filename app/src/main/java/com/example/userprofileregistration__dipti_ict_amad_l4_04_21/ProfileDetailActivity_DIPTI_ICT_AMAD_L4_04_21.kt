package com.example.userprofileregistration__dipti_ict_amad_l4_04_21

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21

class ProfileDetailActivity_DIPTI_ICT_AMAD_L4_04_21 : AppCompatActivity() {
    private lateinit var userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21
    private lateinit var nameText: TextView
    private lateinit var emailText: TextView
    private lateinit var dobText: TextView
    private lateinit var districtText: TextView
    private lateinit var mobileText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail_dipti_ict_amad_l4_04_21)
        userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_DIPTI_ICT_AMAD_L4_04_21

        nameText = findViewById(R.id.nameTextView)
        emailText = findViewById(R.id.emailTextView)
        dobText = findViewById(R.id.dobTextView)
        districtText = findViewById(R.id.districtTextView)
        mobileText = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameText.text = userProfile.name
        emailText.text = userProfile.email
        dobText.text = userProfile.dob
        districtText.text = userProfile.district
        mobileText.text = userProfile.mobile
    }
}