package br.com.coupledev.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.coupledev.fundamentals.adapters.TodoAdapter
import br.com.coupledev.fundamentals.data.Todo
import br.com.coupledev.fundamentals.databinding.ActivityRecycleViewActivityBinding

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecycleViewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Task 1", false),
            Todo("Task 2", false),
            Todo("Task 3", false),
            Todo("Task 4", false),
            Todo("Task 5", false),
            Todo("Task 6", false),
            Todo("Task 7", false),
            Todo("Task 7", true),
            Todo("Task 9", false),
            Todo("Task 10", false),
        )

        val adapter = TodoAdapter(todoList)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        binding.btnAddTodo.setOnClickListener {
            val title = binding.etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }
}