package vcmsa.ci.musicplaylistmanagerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.playlist_screen)

        val playlist = findViewById<Button>(R.id.btnPlaylist)
        val welcome = findViewById<TextView>(R.id.txtWelcome)
    }
}