package com.geektech.playlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.geektech.playlist.databinding.ItemPlaylistBinding

class PlaylistAdapter(
    val songList: ArrayList<Song>,
    val onClick: (position: Int) -> Unit
): Adapter<PlaylistAdapter.SongViewHolder>() {

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = songList.size
    inner class SongViewHolder(private val binding: ItemPlaylistBinding): RecyclerView.ViewHolder(binding.root){
        fun bind() {
            val item = songList[adapterPosition]
            binding.tvSong.text = item.name
            binding.tvSinger.text = item.singer
            binding.tvNumber.text = item.number
            binding.tvTime.text = item.time
        }

    }
}