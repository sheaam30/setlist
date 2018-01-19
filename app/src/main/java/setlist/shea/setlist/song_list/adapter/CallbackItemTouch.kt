package setlist.shea.setlist.song_list.adapter

/**
 * Created by adamshea on 1/14/18.
 */
interface CallbackItemTouch {

    /**
     * Called when an item has been dragged
     * @param oldPosition start position
     * @param newPosition end position
     */
    fun itemTouchOnMove(oldPosition: Int, newPosition: Int)

    fun onItemDropped(oldPosition: Int, newPosition: Int)
}