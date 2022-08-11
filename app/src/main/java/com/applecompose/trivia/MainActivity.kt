package com.applecompose.trivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applecompose.trivia.ui.theme.TriviaTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			TriviaTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					MainScreen()
				}
			}
		}
	}
}

@Composable
fun MainScreen() {
	Column(
				modifier = Modifier
					.fillMaxSize(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.Top
				)

			{
				TopAppBar(modifier = Modifier.fillMaxWidth()) {
					Text(text = "Top App Bar",
						fontSize = 16.sp
						)

				}
				Text(
					text = "Gold Prices",
					fontSize = 24.sp,
					)
				Spacer(modifier = Modifier.height(16.dp))
				Divider(thickness = 2.dp, color = MaterialTheme.colors.primaryVariant)
				Button(
					onClick = {  }) {
					Text(text = "Save")

				}

			}
}