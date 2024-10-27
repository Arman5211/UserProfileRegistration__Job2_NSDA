package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.fragment_dipti_ict_amad_l4_04_21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.R
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.adapter_dipti_ict_amad_l4_04_21.ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.viewmodel_dipti_ict_amad_l4_04_21.UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21

class ProfileListFragment_DIPTI_ICT_AMAD_L4_04_21 : Fragment() {

    private lateinit var profileAdapter: ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21
    private lateinit var profileViewModel: UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_profile_list_fragment_dipti_ict_amad_l4_04_21, container, false)

        // Initialize RecyclerView and ViewModel
        val recyclerView = view.findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter = ProfileAdapter_DIPTI_ICT_AMAD_L4_04_21()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = profileAdapter

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21::class.java)
        profileViewModel.getUserProfiles().observe(viewLifecycleOwner, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        return view
    }
}