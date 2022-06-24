package com.wixsite.mupbam1.resume.bottomnavjc

//https://www.youtube.com/watch?v=gg-KBGH9T8s&list=PLSrm9z4zp4mEWwyiuYgVMWcDFdsebhM-r&index=27

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wixsite.mupbam1.resume.bottomnavjc.ui.theme.BottomNavJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavJCTheme {
                MainScreen()

            }
        }
    }
}

