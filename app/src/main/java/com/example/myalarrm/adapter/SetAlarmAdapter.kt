package com.example.myalarrm.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myalarrm.databinding.AlarmItemBinding

class SetAlarmAdapter(): RecyclerView.Adapter<SetAlarmAdapter.SetAlarmViewHolder>() {

    inner class SetAlarmViewHolder(var binding: AlarmItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetAlarmViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SetAlarmViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}