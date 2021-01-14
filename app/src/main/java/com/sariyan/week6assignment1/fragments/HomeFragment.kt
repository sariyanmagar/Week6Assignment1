package com.sariyan.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sariyan.week6assignment1.R
import com.sariyan.week6assignment1.StoreData
import com.sariyan.week6assignment1.adapter.ProfileAdapter
import com.sariyan.week6assignment1.model.Profile

class HomeFragment : Fragment() {
    private lateinit var rvProfile: RecyclerView
    private var storeData=StoreData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        rvProfile=view.findViewById(R.id.rvProfile)
        loadProfileAdapter()
        return view
    }

    private fun loadProfileAdapter(){
        val array = storeData.returnProfile()
        val adapter=ProfileAdapter(array,this)
        rvProfile.layoutManager=LinearLayoutManager(view?.context,LinearLayoutManager.VERTICAL,false)
        rvProfile.adapter=adapter
    }



}