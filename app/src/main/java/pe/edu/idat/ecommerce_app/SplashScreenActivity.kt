package pe.edu.idat.ecommerce_app

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import pe.edu.idat.ecommerce_app.Vendedor.MainActivityVendedor

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        verBienvenida()
    }

    // funcion de animacion
    private fun verBienvenida() {
        //tiempo
        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                // señala la actividad actual y redirige a la siguiente
                // aplicationContext señala la activity actual
                startActivity(Intent(applicationContext , MainActivityVendedor::class.java))
                finishAffinity()
            }

            override fun onTick(millisUntilFinished: Long) {
            }

        }.start()

    }
}