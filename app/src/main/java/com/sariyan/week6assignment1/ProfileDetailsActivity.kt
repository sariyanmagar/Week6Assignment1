package com.sariyan.week6assignment1

import android.location.Address
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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
    private lateinit var tvprofileId:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)


        imgProfile=findViewById(R.id.imgProfile)
        tvName=findViewById(R.id.tvName)
        tvAge=findViewById(R.id.tvAge)
        tvAddress=findViewById(R.id.tvAddress)
        tvGender=findViewById(R.id.tvGender)
        delete=findViewById(R.id.delete)
        tvprofileId=findViewById(R.id.tvProfileId)

        val intent=intent.getParcelableExtra<Profile>("profile")
        if (intent!=null){
            val profileId = intent.profileId
            val Name=intent.Name
            val Address=intent.Address
            val Age=intent.Age
            val Gender=intent.Gender
            val Image=intent.Image

            tvName.text=Name
            tvAge.text=Age.toString()
            tvAddress.text=Address
            tvGender.text=Gender
            tvprofileId.text=profileId.toString()
            Glide.with(this@ProfileDetailsActivity)
                .load(Image)
                .into(imgProfile)






        }
    }
}
