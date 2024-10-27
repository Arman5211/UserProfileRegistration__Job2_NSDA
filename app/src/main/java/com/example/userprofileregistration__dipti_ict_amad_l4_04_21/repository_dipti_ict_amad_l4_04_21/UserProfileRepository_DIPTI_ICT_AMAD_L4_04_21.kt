package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.repository_dipti_ict_amad_l4_04_21

import androidx.lifecycle.LiveData
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.dao_dipti_ict_amad_l4_04_21.UserProfileDao_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21

class UserProfileRepository_DIPTI_ICT_AMAD_L4_04_21 (private val userProfileDao: UserProfileDao_DIPTI_ICT_AMAD_L4_04_21) {

    fun getUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_AMAD_L4_04_21>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21) {
        userProfileDao.delete(userProfile)
    }

}