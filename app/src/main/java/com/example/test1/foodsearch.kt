package com.example.test1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.test1.ui.notifications.NotificationsFragment
import com.example.test1.ui.notifications.NotificationsViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
//import kotlinx.android.synthetic.main.fragment_notifications.*

//import kotlinx.android.synthetic.main.fragment_notifications.*
//import kotlinx.android.synthetic.main.fragment_notifications.view.*

class foodsearch :Fragment() {
    val database = Firebase.database
    val foodref = database.getReference("7695")
    //val text1 = text_notifications.text

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_notifications,container,false)

        foodref.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val test = snapshot.child("Column5")
                for (ds in test.children) {
                    Log.e("snap", ds.toString())

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("snap", "error1")
            }
        })
        return view
    }
}