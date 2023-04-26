package com.example.simplecalculatorproject

class Calculator(private val operand1: Double, private val operand2: Double) {
    fun performOperation(operation: Operations): Double {
        return when (operation) {
            Operations.ADD -> operand1 + operand2
            Operations.SUBTRACT -> operand1 - operand2
            Operations.MULTIPLY -> operand1 * operand2
            Operations.DIVIDE -> operand1 / operand2
        }
    }
}
