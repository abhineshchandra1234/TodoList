package com.example.todolist.ui.tasks

import androidx.lifecycle.ViewModel
import com.example.todolist.data.TaskDao
import javax.inject.Inject

class TasksViewModel @Inject constructor(
    private val taskDao: TaskDao
) : ViewModel()