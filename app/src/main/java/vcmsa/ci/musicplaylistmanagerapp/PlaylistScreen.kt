package vcmsa.ci.musicplaylistmanagerapp

import android.content.Intent
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

        // Code that calls the song details.
        val song = findViewById<Button>(R.id.btnSong)
        val txtSong = findViewById<TextView>(R.id.edtSong)

        // Code that calls the artist details.
        val artist = findViewById<Button>(R.id.btnArtist)
        val txtArtist = findViewById<TextView>(R.id.edtArtist)

        // Code that calls the song rating details.
        val rating = findViewById<Button>(R.id.btnRating)
        val txtRating = findViewById<TextView>(R.id.edtRating)

        // Code that calls the users comment details.
        val comment = findViewById<Button>(R.id.btnComment)
        val txtComment = findViewById<TextView>(R.id.edtComment)

        // code that calls the exit button.
        val exit = findViewById<Button>(R.id.btnExit)

        //code that calls the details button.
        val details = findViewById<Button>(R.id.btnDetails)
        //==========================================================================================

        //==========================================================================================
        // The code below declares variables for arrays and has pre determined data for the user to have examples of what to add.
        val i = 0 // 'i' is used to represent index.
        val arrSong = arrayOf("One Dance", "Alright","January 28th","Snooze")//: Array<String>
        val arrArtist = arrayOf("Drake", "Kendrick Lamar", "J.Cole", "SZA") //:Array<String>
        val arrRating = arrayOf(4,5,5,4) //:Array<Double>
        val arrComment = arrayOf("The song is electrifying and makes me dance.","This song makes bad feelings go away","What and experience we got taken on", "This is a great Love song.") //:ArrayList<String>//
        //==========================================================================================

        //==========================================================================================
        // The code below requires the user to click the 'Add Playlist Button' so that it shows the user the first piece of data they are required to fill in.
        playlist.setOnClickListener{
            song.setVisibility(View.VISIBLE)
            txtSong.setVisibility(View.VISIBLE) }

        song.setOnClickListener{
            //txtSong.text=arrSong[i]
            artist.setVisibility(View.VISIBLE)
            txtArtist.setVisibility(View.VISIBLE)
        }

        artist.setOnClickListener{
            //txtArtist.text=arrSong[i]
            rating.setVisibility(View.VISIBLE)
            txtRating.setVisibility(View.VISIBLE)
        }

        rating.setOnClickListener{
            //txtRating.text=arrSong[i]
            comment.setVisibility(View.VISIBLE)
            txtComment.setVisibility(View.VISIBLE)
        }

        //==========================================================================================

        //==========================================================================================
        //The code below allows to user to exit the app.
        exit.setOnClickListener{finishAffinity()}
        //==========================================================================================

        details.setOnClickListener{
            val playlistToDetails = Intent(this, DetailsDisplay::class.java)
            playlistToDetails.putExtra("song", arrSong)
            playlistToDetails.putExtra("artist", arrArtist)
            playlistToDetails.putExtra("rating", arrRating)
           playlistToDetails.putExtra("comment", arrComment)
            startActivity(playlistToDetails)
        }

    }
}