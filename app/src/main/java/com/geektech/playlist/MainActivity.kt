package com.geektech.playlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.geektech.playlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val songList = arrayListOf<Song>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        val adapter = PlaylistAdapter(songList, this::onClick)
        binding.recyclerView.adapter = adapter

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.fragment_first, FirstFragment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.fragment_second, SecondFragment()).commit()
        }
    }

    private fun onClick(position: Int){
        val intent = Intent(this, SecondActivity::class.java)
        val songName = songList[position].name
        intent.putExtra("name", songName)
        startActivity(intent)
    }

        private fun loadData(){
        songList.add(Song("1", "What Do You Mean?", "Justin Bieber", "3:26"))
        songList.add(Song("2", "Big Boy", "SZA", "3:13"))
        songList.add(Song("3", "After Hours", "The Weekend", "4:07"))
        songList.add(Song("4", "Side To Side", "Ariane Grande", "3:35"))
        songList.add(Song("5", "Night Changes", "One Direction", "3:56"))
        songList.add(Song("6", "Streets", "Doja Cat", "3:33"))
        songList.add(Song("7", "People You Know", "Selena Gomez", "3:16"))
        songList.add(Song("8", "Summertime Sadness", "Lana Del Rey", "4:42"))
        songList.add(Song("9", "Under The Influence", "Chris Brown", "3:39"))
        songList.add(Song("10", "Drivers License", "Olivia Rodrigo", "4:08"))
        songList.add(Song("11", "No", "Meghan Trainor", "3:34"))
    }
}