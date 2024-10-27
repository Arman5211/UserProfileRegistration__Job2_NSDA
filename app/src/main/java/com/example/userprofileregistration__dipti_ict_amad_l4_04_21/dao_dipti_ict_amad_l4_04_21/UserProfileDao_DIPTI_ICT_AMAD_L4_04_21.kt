package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.dao_dipti_ict_amad_l4_04_21

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21


@Dao
interface UserProfileDao_DIPTI_ICT_AMAD_L4_04_21 {
    @Insert
    suspend fun insert(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21)

    @Update
    suspend fun update(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21)

    @Delete
    suspend fun delete(userProfile: UserProfile_DIPTI_ICT_AMAD_L4_04_21)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile_DIPTI_ICT_AMAD_L4_04_21>>







}