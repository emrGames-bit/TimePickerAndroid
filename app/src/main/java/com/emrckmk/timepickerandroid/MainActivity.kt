package com.emrckmk.timepickerandroid

import android.app.TimePickerDialog
import android.content.DialogInterface
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        editTextTextPersonName.setOnClickListener {
            val calendar = Calendar.getInstance()
            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)


            val timePacker : TimePickerDialog

            timePacker = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

                editTextTextPersonName.setText("$hourOfDay:$minute")

            },saat,dakika,true)

            timePacker.setTitle("Saat Seçiniz")
            timePacker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePacker)
            timePacker.setButton(DialogInterface.BUTTON_NEGATIVE,"Iptal",timePacker)

            timePacker.show()
        }



    }
}