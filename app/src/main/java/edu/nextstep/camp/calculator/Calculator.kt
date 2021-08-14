package edu.nextstep.camp.calculator

class Calculator {
    fun calculate(inputFormula: String): Int {
        val formula = inputFormula.split(" ")
        var result = formula[0].toInt()

        for (i in 1 until formula.size step 2) {
            val operator = getOperator(formula[i])

            if (operator is Operator) {
                result = operator.operate(result, formula[i + 1].toInt())
            }
        }
        return result
    }
}