package vcmsa.ci.musicplaylistmanagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.details_display)

        //==========================================================================================
        //Calling components from display details .xml to .kt folder
        val show = findViewById<Button>(R.id.btnDisplay)
        val aveRating = findViewById<Button>(R.id.btnAveRating)
        val back = findViewById<Button>(R.id.btnReturn)
        //==========================================================================================

        //==========================================================================================
        //The code below takes the user back to the playlist screen where they can enter their information.
        back.setOnClickListener{
            val backToPlaylist = Intent(this,MainActivity::class.java)
            startActivity(backToPlaylist)
        }

        //==========================================================================================

        //==========================================================================================
        show.setOnClickListener{

        }
        //==========================================================================================


    }
}