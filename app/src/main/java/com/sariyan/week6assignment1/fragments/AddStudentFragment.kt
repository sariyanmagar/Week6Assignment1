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

class AddStudentFragment: Fragment() {

    private lateinit var btnSave: Button
    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var etImage: EditText
    private lateinit var etAddress: EditText
    private lateinit var Male: RadioButton
    private lateinit var Female: RadioButton
    private lateinit var Others: RadioButton
    private var gender = " "

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        etFullName = view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.etAge)
        etImage = view.findViewById(R.id.etImage)
        etAddress = view.findViewById(R.id.etAddress)
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
            if(validateInput()) {
                var fullname = etFullName.text.toString()
                var ProfileImage = etImage.text.toString()
                var age = etAge.text.toString()
                var address = etAddress.text.toString()
                StoreData().appendProfile(Profile(fullname, ProfileImage, age, address, gender))
                Toast.makeText(view?.context, "Student Added Sucessfully", Toast.LENGTH_LONG).show()
                etFullName.setText("")
                etImage.setText("")
                etAddress.setText("")
                etAge.setText("")
                etFullName.requestFocus()
            }else{
                Toast.makeText(view?.context, "Try Again", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
    private fun validateInput(): Boolean {
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



