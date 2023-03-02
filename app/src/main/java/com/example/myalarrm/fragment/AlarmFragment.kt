package com.example.myalarrm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myalarrm.adapter.SetAlarmAdapter
import com.example.myalarrm.databinding.FragmentAlarmBinding
import com.example.myalarrm.model.SetAlarmModel


class AlarmFragment : Fragment() {

    private lateinit var binding: FragmentAlarmBinding
    private lateinit var list: ArrayList<SetAlarmModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentAlarmBinding.inflate(layoutInflater)

        list = ArrayList()
        getItem()

        binding.floatingButton.setOnClickListener {
            Toast.makeText(requireContext(),"clicked floatingButton",Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

    private fun getItem() {
        binding.recyclerView.adapter = SetAlarmAdapter(list, requireContext())

    }


}