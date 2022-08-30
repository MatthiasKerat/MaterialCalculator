package com.example.materialcalculator.presentation

import androidx.compose.runtime.Composable
import com.example.materialcalculator.domain.CalculatorAction

data class CalculatorUiAction(
    val text: String?,
    val highlightLevel:HighlightLevel,
    val action:CalculatorAction,
    val content : @Composable () -> Unit = {}
)

sealed interface HighlightLevel{
    object Neutral:HighlightLevel
    object SemiHighlighted:HighlightLevel
    object Hightlighted:HighlightLevel
    object StronglyHighlighted:HighlightLevel
}