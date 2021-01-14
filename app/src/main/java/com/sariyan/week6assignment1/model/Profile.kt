package com.sariyan.week6assignment1.model

import android.os.Parcel
import android.os.Parcelable

data class Profile(
        val profileId: Int? =null,
        val Name: String?=null,
        val ProfileImage: String?=null,
        val Address: String?=null,
        val Gender:String?=null,
        val Age: Int?=null,
): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(profileId)
        parcel.writeString(Name)
        parcel.writeString(ProfileImage)
        parcel.writeString(Address)
        parcel.writeString(Gender)
        parcel.writeValue(Age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Profile> {
        override fun createFromParcel(parcel: Parcel): Profile {
            return Profile(parcel)
        }

        override fun newArray(size: Int): Array<Profile?> {
            return arrayOfNulls(size)
        }
    }
}