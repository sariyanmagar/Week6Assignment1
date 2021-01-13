package com.sariyan.week6assignment1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sariyan.week6assignment1.R
import com.sariyan.week6assignment1.model.Profile
import de.hdodenhof.circleimageview.CircleImageView

class ProfileAdapter (
    val lstProfile:ArrayList<Profile>,
    val context:Context
    ):RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>(){
        class ProfileViewHolder(view: View):RecyclerView.ViewHolder(view){
          val imgProfile:CircleImageView
          val tvName:TextView
          val tvAddress:TextView
          val tvAge:TextView
          val tvGender:TextView


          init {
              imgProfile=view.findViewById(R.id.imgProfile)
              tvName=view.findViewById(R.id.tvName)
              tvAge=view.findViewById(R.id.tvAge)
              tvAddress=view.findViewById(R.id.tvAddress)
              tvGender=view.findViewById(R.id.tvGender)
          }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.profile,parent,false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile=lstProfile[position]
        holder.tvName.text=profile.Name
        holder.tvAddress.text=profile.Address
        holder.tvAge.text= profile.Age.toString()

        Glide.with(context)
                .load(profile.Image)
                .into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return lstProfile.size
    }
}
