package com.example.reminder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ReminderAdapter {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }

}