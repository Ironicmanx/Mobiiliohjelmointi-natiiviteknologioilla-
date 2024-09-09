
package com.example.a3

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding

@Composable
fun BmiResult(heightInput: String, weightInput: String) {
    val bmi = calculateBmi(heightInput, weightInput)
    Text(
        text = "BMI: %.2f".format(bmi),
        fontSize = 20.sp,
        modifier = Modifier.padding(vertical = 16.dp)
    )
}

private fun calculateBmi(heightInput: String, weightInput: String): Float {
    val height = heightInput.toFloatOrNull() ?: return 0f
    val weight = weightInput.toFloatOrNull() ?: return 0f
    return if (height > 0f) weight / (height * height) else 0f
}
