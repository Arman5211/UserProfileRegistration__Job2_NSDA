package com.example.userprofileregistration__dipti_ict_amad_l4_04_21.database_dipti_ict_amad_l4_04_21

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.dao_dipti_ict_amad_l4_04_21.UserProfileDao_DIPTI_ICT_AMAD_L4_04_21
import com.example.userprofileregistration__dipti_ict_amad_l4_04_21.model_dipti_ict_amad_l4_04_21.UserProfile_DIPTI_ICT_AMAD_L4_04_21


@Database(entities = [UserProfile_DIPTI_ICT_AMAD_L4_04_21::class], version = 1)
abstract class UserDatabase_DIPTI_ICT_AMAD_L4_04_21 : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao_DIPTI_ICT_AMAD_L4_04_21

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_DIPTI_ICT_AMAD_L4_04_21? = null

        fun getDatabase(context: Context): UserDatabase_DIPTI_ICT_AMAD_L4_04_21 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_DIPTI_ICT_AMAD_L4_04_21::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}