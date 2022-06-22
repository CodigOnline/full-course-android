package es.codigonline.curso.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import es.codigonline.curso.components.databinding.ActivityTimeBinding
import java.text.SimpleDateFormat
import java.util.*

class TimeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cal = Calendar.getInstance()
        cal.add(Calendar.YEAR,1)

        val constraintsDatePicker = CalendarConstraints.Builder()
            .setStart(Date().time)
            .setEnd(cal.timeInMillis)
            .setValidator(DateValidatorPointForward.now())
            .build()

        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Selecciona la fecha de la consulta")
            .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
            .setCalendarConstraints(constraintsDatePicker)
            .build()
        datePicker.addOnPositiveButtonClickListener {
            val sdf = SimpleDateFormat("dd/MM/yyyy",Locale("es","ES"))
            binding.textCalendar.text = sdf.format(Date(it)).toString()
        }

        binding.calendar.setOnClickListener {
            datePicker.show(supportFragmentManager,"calendar")
        }


        val timePicker = MaterialTimePicker.Builder().setTimeFormat(TimeFormat.CLOCK_24H)
            .setHour(0)
            .setMinute(0)
            .setTitleText("Selecciona la hora para la consulta")
            .build()

        timePicker.addOnPositiveButtonClickListener {
            binding.textTime.text = "${timePicker.hour} : ${timePicker.minute}"
        }


        binding.time.setOnClickListener {
            timePicker.show(supportFragmentManager,"Time")
        }
    }
}