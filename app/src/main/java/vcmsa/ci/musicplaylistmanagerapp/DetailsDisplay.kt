package vcmsa.ci.musicplaylistmanagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        val txtShow= findViewById<TextView>(R.id.txtDisplay)
        val index=0

        val arraySong=intent.getIntExtra("comment",arrSong)
        val arrayArtist=intent.getIntExtra("comment",arrArtist)
        val arrayRating=intent.getIntExtra("comment",arrRating)
        val arrayComment=intent.getIntExtra("comment",arrComment)

        //==========================================================================================

        //==========================================================================================
        //The code below takes the user back to the playlist screen where they can enter their information.
        back.setOnClickListener{
            val backToPlaylist = Intent(this,MainActivity::class.java)
            startActivity(backToPlaylist)
        }

        //==========================================================================================

        //==========================================================================================
        // the code below allows the user to see the data they entered in the Playlist screen.
        show.setOnClickListener{
            while (index<=arrayComment.size){// The loop checks if there is any data in the comment array because it is the last array in the to have data entered into.
            val userSee = StringBuilder()
                //the code below collects information from the arrays that are called from the playlist screen folder then outputs it into the txtShow textview.
            userSee.append("Song Name: ${arraySong[index]} \nArtist Name: ${arrayArtist[index]} \nSong rating:${arrayRating[index]} \n Personal comment: ${arrayComment[index]}")
                txtShow.text=userSee.toString()
                index = index + 1//index will increase until the while loop condition id true.
            }
        }
        //==========================================================================================


    }
}