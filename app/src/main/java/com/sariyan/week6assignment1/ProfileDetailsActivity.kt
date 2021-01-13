package com.sariyan.week6assignment1

import android.location.Address
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.sariyan.week6assignment1.model.Profile
import de.hdodenhof.circleimageview.CircleImageView
import java.util.jar.Attributes

class ProfileDetailsActivity : AppCompatActivity() {
    private lateinit var imgProfile:CircleImageView
    private lateinit var tvName:TextView
    private lateinit var tvAge:TextView
    private lateinit var tvAddress: TextView
    private lateinit var tvGender:TextView
    private lateinit var delete:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)


        imgProfile=findViewById(R.id.imgProfile)
        tvName=findViewById(R.id.tvName)
        tvAddress=findViewById(R.id.tvAddress)
        tvAge=findViewById(R.id.tvAge)
        tvGender=findViewById(R.id.tvGender)
        delete=findViewById(R.id.delete)

        val intent=intent.getParcelableExtra<Profile>("profile")
        if (intent!=null){
            val profileId = intent.profileId
            val Name=intent.Name
            val Address=intent.Address
            val Age=intent.Image
            val Gender=intent.Gender




        }
    }
}
