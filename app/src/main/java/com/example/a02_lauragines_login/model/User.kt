package com.example.a02_lauragines_login.model
import android.os.Parcel
import android.os.Parcelable


@User.Parcelize
class User(
         val userEmail: String,
         val userPassword: String

) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readString().toString(),
                parcel.readString().toString()
        )

        annotation class Parcelize

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeString(userEmail)
                parcel.writeString(userPassword)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<User> {
                override fun createFromParcel(parcel: Parcel): User {
                        return User(parcel)
                }

                override fun newArray(size: Int): Array<User?> {
                        return arrayOfNulls(size)
                }
        }

}


