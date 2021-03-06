package com.wixsite.mupbam1.resume.bottomnavjc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.wixsite.mupbam1.resume.bottomnavjc.ui.theme.BottomNavJCTheme


@Composable
fun HomeScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
    contentAlignment = Alignment.Center){
        Text(text = "HomeScreen",
        fontSize = MaterialTheme.typography.h3.fontSize,
        fontWeight = FontWeight.Bold,
        color = Color.White)
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreentPreview() {
   HomeScreen()
}