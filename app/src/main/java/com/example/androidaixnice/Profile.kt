package com.example.androidaixnice

import android.os.Parcel
import android.os.Parcelable

data class Profile(var name: String?, var age:Int) : Parcelable   {

    constructor(parcel : Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flat: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Profile>{
        override fun createFromParcel(parcel: Parcel): Profile {
            return Profile(parcel)
        }

        override fun newArray(size: Int): Array<Profile?> {
            return  arrayOfNulls(size)
        }
    }
}