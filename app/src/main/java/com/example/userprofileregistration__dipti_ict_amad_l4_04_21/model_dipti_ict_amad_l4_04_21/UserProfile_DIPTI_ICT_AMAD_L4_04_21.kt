package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "user_profile")
data class UserProfile_DIPTI_ICT_AMAD_L4_04_21(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val dob: String,
    val district: String,
    val mobile: String
): Serializable







