package com.example.userprofileregistration__dipti_ict_amad_l4_04_21

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.adapter_dipti_ict_amad_l4_04_21.ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.viewmodel_dipti_ict_amad_l4_04_21.UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_DIPTI_ICT_AMAD_L4_04_21 : AppCompatActivity() {

    private lateinit var profileViewModel: UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21
    private lateinit var profileAdapter: ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_dipti_ict_amad_l4_04_21)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter = ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        profileViewModel.getUserProfiles().observe(this, Observer {
            profileAdapter.submitList(it)
        })

        profileAdapter.setOnItemClickListener {
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_AMAD_L4_04_21, ProfileDetailActivity_DIPTI_ICT_AMAD_L4_04_21::class.java)
            intent.putExtra("USER_PROFILE", it)
            startActivity(intent)
        }

        profileAdapter.setOnDeleteClickListener {
            profileViewModel.deleteUserProfile(it)
        }

        profileAdapter.setOnUpdateClickListener {
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_AMAD_L4_04_21, UpdateProfileActivity_DIPTI_ICT_AMAD_L4_04_21::class.java)
            intent.putExtra("USER_PROFILE", it)
            startActivity(intent)
        }

        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this@ProfileListActivity_DIPTI_ICT_AMAD_L4_04_21, AddProfileActivity_DIPTI_ICT_AMAD_L4_04_21::class.java)
            startActivity(intent)
        }
    }
    private fun showDeleteConfirmationDialog(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Delete Profile")
        builder.setMessage("Are you sure you want to delete this profile?")

        builder.setPositiveButton("Yes") { dialog, which ->
            profileViewModel.deleteUserProfile(userProfile)  // Delete the profile
            dialog.dismiss()
        }

        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()  // Cancel delete operation
        }

        val dialog = builder.create()
        dialog.show()

        // Comment out or remove the LoadingActivity part
        // val intent = Intent(this, LoadingActivity::class.java)
        // intent.putExtra("TARGET_ACTIVITY", "com.example.userprofileregistration.ProfileActivity")
        // startActivity(intent)
    }
}