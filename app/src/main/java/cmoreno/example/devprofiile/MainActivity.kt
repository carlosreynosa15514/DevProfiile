package cmoreno.example.devprofiile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
// import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dandole redondeo al logo
        // Pasos:
        // 1. Se crea un bitmap
        // 2. Se le dan esquinas redondeadas
        // 3. Se asigna el logo a ese bitmap

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)

        rounded.cornerRadius = (15f)
        // Tambien se puede usar la siguiente instruccin para hacerlo redondo
        rounded.isCircular = true
        // Esta instruccion no funciono, porque no se importo kotlinx
        // logo.setImageDrawable(rounded)
        R.drawable.devslopesprofilelogo





    }
}