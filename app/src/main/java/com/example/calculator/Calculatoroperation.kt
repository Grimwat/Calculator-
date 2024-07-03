package com.example.calculator

sealed class Calculatoroperation (val Symbol: String) {
    object Add: Calculatoroperation("+")
    object Subtract: Calculatoroperation("-")
    object Divide: Calculatoroperation("/")
    object Times: Calculatoroperation("*")
}