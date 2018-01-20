package setlist.shea.setlist.song_list.adapter

import android.graphics.Paint
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import setlist.shea.domain.model.Song
import setlist.shea.setlist.R

/**
 * Created by Adam on 8/28/2017.
 */
class SongViewHolder(view : View): RecyclerView.ViewHolder(view),
        SongViewHolderInterface<Song> {

    val songName : TextView = view.findViewById(R.id.song_name)
    val songArtist : TextView = view.findViewById(R.id.song_artist)
    val songPlayed = view.findViewById<CheckBox>(R.id.played_checkbox)
    val moveItem = view.findViewById<ImageView>(R.id.reorder)!!

    override fun bind(data: Song) {
        songName.text = data.name
        songArtist.text = data.artist
        songPlayed.isChecked = data.played

        if (data.played) {
            songName.paintFlags = songName.paintFlags.plus(Paint.STRIKE_THRU_TEXT_FLAG)
            songArtist.paintFlags = songArtist.paintFlags.plus(Paint.STRIKE_THRU_TEXT_FLAG)
        } else {
            songName.paintFlags = songName.paintFlags.minus(Paint.STRIKE_THRU_TEXT_FLAG)
            songArtist.paintFlags = songArtist.paintFlags.minus(Paint.STRIKE_THRU_TEXT_FLAG)
        }
    }
}