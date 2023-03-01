package com.example.myalarrm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myalarrm.databinding.AlarmItemBinding
import com.example.myalarrm.model.SetAlarmModel

class SetAlarmAdapter(val list: ArrayList<SetAlarmModel>, val context: Context) :
    RecyclerView.Adapter<SetAlarmAdapter.SetAlarmViewHolder>() {

    inner class SetAlarmViewHolder(var binding: AlarmItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetAlarmViewHolder {

        return SetAlarmViewHolder(
            AlarmItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    }

    override fun onBindViewHolder(holder: SetAlarmViewHolder, position: Int) {

        holder.binding.timeText.text = list[position].time

    }

    override fun getItemCount(): Int {

        return list.size
    }
}