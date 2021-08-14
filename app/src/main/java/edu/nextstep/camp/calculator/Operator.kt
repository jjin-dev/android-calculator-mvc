package edu.nextstep.camp.calculator

enum class Operator {
    PLUS, MINUS, MULTIPLE, DIVIDE;

    fun operate(input1: Int, input2: Int) = when (this) {
        PLUS -> input1 + input2
        MINUS -> input1 - input2
        MULTIPLE -> input1 * input2
        DIVIDE -> input1 / input2
    }
}

fun getOperator(input: String) = when (input) {
    "+" -> Operator.PLUS
    "-" -> Operator.MINUS
    "*" -> Operator.MULTIPLE
    "/" -> Operator.DIVIDE
    else -> NumberFormatException("올바르지 않은 기호입니다.")
}