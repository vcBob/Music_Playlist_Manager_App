package vcmsa.ci.musicplaylistmanagerapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.playlist_screen)

        //==========================================================================================
        // The code below uses the function 'findviewbyid' to identify components by there id names and call them from the .xml folder to the .kt folder of the playlist screen folder.
        val playlist = findViewById<Button>(R.id.btnPlaylist)
        val welcome = findViewById<TextView>(R.id.txtWelcome)

        // code for calling song details.
        val song = findViewById<Button>(R.id.btnSong)
        val txtSong = findViewById<TextView>(R.id.edtSong)
        //==========================================================================================

        //==========================================================================================
        // The code below declares variables for arrays and has pre determened data for the user to have examples of what to add.
        val i = 3 // 'i' is used to represent index.
        val arrSong = arrayOf("One Dance", "Alright","January 28th","Snooze")
        val arrArtist = arrayOf("Drake", "Kendrick Lamar", "J.Cole", "SZA")
        val arrRating = arrayOf(4,5,5,4)
        val arrComment = arrayOf("The song is electrifying and makes me dance.","This song makes bad feelings go away","What and experiance we got taken on", "This is a great Love song.")
        //==========================================================================================

        //==========================================================================================
        playlist.setOnClickListener{
            song.setVisibility(View.VISIBLE)
            txtSong.setVisibility(View.VISIBLE) }

    }
}