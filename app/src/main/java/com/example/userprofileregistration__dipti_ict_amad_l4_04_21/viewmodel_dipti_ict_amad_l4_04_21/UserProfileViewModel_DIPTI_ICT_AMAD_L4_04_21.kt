package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.viewmodel_dipti_ict_amad_l4_04_21

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.database_dipti_ict_amad_l4_04_21.UserDatabase_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.repository_dipti_ict_amad_l4_04_21.UserProfileRepository_DIPTI_ICT_AMAD_L4_04_21
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_DIPTI_ICT_AMAD_L4_04_21(application: Application) : AndroidViewModel(application) {
    private val repository: UserProfileRepository_DIPTI_ICT_AMAD_L4_04_21

    init {
        val userProfileDao = UserDatabase_DIPTI_ICT_AMAD_L4_04_21.getDatabase(application).userProfileDao()
        repository = UserProfileRepository_DIPTI_ICT_AMAD_L4_04_21(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_AMAD_L4_04_21>>{
        return repository.getUserProfiles()
    }

    fun insertUserProfile(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(userProfile)
        }
    }

    fun updateUserProfile(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }

    fun deleteUserProfile(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }
}