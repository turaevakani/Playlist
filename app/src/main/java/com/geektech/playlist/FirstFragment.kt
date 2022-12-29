package com.geektech.playlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.playlist.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return  binding.root
    }




//    private fun loadData(){
//        songList.add(Song("1", "What Do You Mean?", "Justin Bieber", "3:26"))
//        songList.add(Song("2", "Big Boy", "SZA", "3:13"))
//        songList.add(Song("3", "After Hours", "The Weekend", "4:07"))
//        songList.add(Song("4", "Side To Side", "Ariane Grande", "3:35"))
//        songList.add(Song("5", "Night Changes", "One Direction", "3:56"))
//        songList.add(Song("6", "Streets", "Doja Cat", "3:33"))
//        songList.add(Song("7", "People You Know", "Selena Gomez", "3:16"))
//        songList.add(Song("8", "Summertime Sadness", "Lana Del Rey", "4:42"))
//        songList.add(Song("9", "Under The Influence", "Chris Brown", "3:39"))
//        songList.add(Song("10", "Drivers License", "Olivia Rodrigo", "4:08"))
//        songList.add(Song("11", "No", "Meghan Trainor", "3:34"))
//    }



}