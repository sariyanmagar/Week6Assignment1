package com.sariyan.week6assignment1

import com.sariyan.week6assignment1.model.Profile

private  var listProfile= arrayListOf<Profile>()
var loggedIn:Profile?=null

class StoreData {
    fun appendProfile(profile: Profile){
        listProfile.add(profile)
        println(listProfile.size)
    }

    fun returnProfile():ArrayList<Profile>{
        return listProfile
    }

    fun deleteProfile(profile: Profile){
        listProfile.remove(profile)
    }

    public fun setLoggegIn(id: Profile?){
        println(id)
        loggedIn=id
    }

    public fun getloggedIn():Profile?{
        return loggedIn
    }
}