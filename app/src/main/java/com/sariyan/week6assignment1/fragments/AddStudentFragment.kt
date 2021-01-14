package com.sariyan.week6assignment1.fragments

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.sariyan.week6assignment1.R
import de.hdodenhof.circleimageview.CircleImageView

class AddStudentFragment : Fragment() {
    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var tvGender: TextView
    private lateinit var Male: RadioButton
    private lateinit var Female: RadioButton
    private lateinit var Others: RadioButton
    private lateinit var etAddress: EditText
    private lateinit var btnSave: Button
    private lateinit var image: CircleImageView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        etFullName = view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.tvAge)
        etAddress = view.findViewById(R.id.tvAddress)
        tvGender = view.findViewById(R.id.tvGender)
        Male = view.findViewById(R.id.Male)
        Female = view.findViewById(R.id.Female)
        Others = view.findViewById(R.id.Others)
        btnSave = view.findViewById(R.id.btnSave)
        image=view.findViewById(R.id.imgProfile)

    }
}



