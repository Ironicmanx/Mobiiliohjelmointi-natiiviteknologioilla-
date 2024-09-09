
package com.example.a3

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

@Composable
fun HeightInput(heightInput: String, onHeightChange: (String) -> Unit) {
    OutlinedTextField(
        value = heightInput,
        onValueChange = {
            onHeightChange(it.replace(',', '.')) // Replace comma with dot
        },
        label = { Text("Height (m)") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}
