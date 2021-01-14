package com.sariyan.week6assignment1.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.sariyan.week6assignment1.R
import com.sariyan.week6assignment1.StoreData
import com.sariyan.week6assignment1.model.Profile

class AddStudentFragment : Fragment() {
    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var tvGender: TextView
    private lateinit var Male: RadioButton
    private lateinit var Female: RadioButton
    private lateinit var Others: RadioButton
    private lateinit var etAddress: EditText
    private lateinit var btnSave: Button
    private lateinit var etImage: EditText

    private var gender = " "


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        etFullName = view.findViewById(R.id.etFullName)
        etImage = view.findViewById(R.id.etImage)
        etAge = view.findViewById(R.id.tvAge)
        etAddress = view.findViewById(R.id.tvAddress)
        tvGender = view.findViewById(R.id.tvGender)
        Male = view.findViewById(R.id.Male)
        Female = view.findViewById(R.id.Female)
        Others = view.findViewById(R.id.Others)
        btnSave = view.findViewById(R.id.btnSave)

        Male.setOnClickListener {
            gender = "Male"
        }

        Female.setOnClickListener {
            gender = "Female"
        }

        Others.setOnClickListener {
            gender = "Others"
        }

        btnSave.setOnClickListener {
            if (validInput()) {
                var fullName=etFullName.text.toString()
                var profileImage = etImage.text.toString()
                var age = etAge.text.toString()
                var address = etAddress.text.toString()
                StoreData().appendProfile(Profile(fullName, profileImage, age, address, gender))
                Toast.makeText(view?.context, "Student's Profile added successfully", Toast.LENGTH_LONG).show()
                etFullName.setText("")
                etImage.setText("")
                etAge.setText("")
                etAddress.setText("")
                etFullName.requestFocus()

            } else {
                Toast.makeText(view?.context, "Invalid", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }

    private fun validInput(): Boolean {
        var res : Boolean = true
        when {
            TextUtils.isEmpty(etFullName.text) -> {
                etFullName.error = "This field should not be empty"
                etFullName.requestFocus()
                res = false
            }
            TextUtils.isEmpty(etImage.text) -> {
                etImage.error = "This field should not be empty"
                etImage.requestFocus()
                res = false
            }
            TextUtils.isEmpty(etAddress.text) -> {
                etAddress.error = "This field should not be empty"
                etAddress.requestFocus()
                res = false
            }
            TextUtils.isEmpty(etAge.text) -> {
                etAge.error = "This field should not be empty"
                etAge.requestFocus()
                res = false
            }
        }

        return res

    }
}



