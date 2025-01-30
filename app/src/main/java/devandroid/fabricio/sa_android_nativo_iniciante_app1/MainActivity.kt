package devandroid.fabricio.sa_android_nativo_iniciante_app1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cvCreatura = findViewById<CardView>(R.id.cvCreatura)

        cvCreatura.setOnClickListener {
            Toast.makeText(this, "CardView clicado!", Toast.LENGTH_SHORT).show()
            // Navegar para a nova Activity
        val newActivityIntent = Intent(this, CreatureViewActivity::class.java)
            startActivity(newActivityIntent)
        }
    }
}