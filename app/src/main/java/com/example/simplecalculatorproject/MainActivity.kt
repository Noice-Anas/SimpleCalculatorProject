package com.example.simplecalculatorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecalculatorproject.databinding.ActivityMainBinding
import android.util.Log
import kotlin.math.log


class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Set up click listeners for operation buttons
            binding.addButton.setOnClickListener { performCalculation(Operations.ADD) }
            binding.subtractButton.setOnClickListener { performCalculation(Operations.SUBTRACT) }
            binding.multiplyButton.setOnClickListener { performCalculation(Operations.MULTIPLY) }
            binding.divideButton.setOnClickListener { performCalculation(Operations.DIVIDE) }
        }

        private fun performCalculation(operation: Operations) {
            // Get operand values from EditText fields
            val operand1 = binding.operand1EditText.text.toString().toDouble()
            val operand2 = binding.operand2EditText.text.toString().toDouble()

            // Perform calculation based on selected operation
            val result = when (operation) {
                Operations.ADD -> operand1 + operand2
                Operations.SUBTRACT -> operand1 - operand2
                Operations.MULTIPLY -> operand1 * operand2
                Operations.DIVIDE -> operand1 / operand2
            }

            // Display result in TextView
            binding.resultTextView.text = result.toString()
        }

        enum class Operations {
            ADD,
            SUBTRACT,
            MULTIPLY,
            DIVIDE
        }
    }