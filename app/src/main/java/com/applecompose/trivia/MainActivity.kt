package com.applecompose.trivia

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.applecompose.trivia.presentation.screens.QuestionsViewModel
import com.applecompose.trivia.ui.theme.TriviaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
					TriviaHome()
				}
			}
		}
	}
}

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {
	Questions(viewModel)

}

@Composable
fun Questions(viewModel: QuestionsViewModel) {

	val questions = viewModel.data.value.data?.toMutableList()

	Log.d("SIZE", "Questions: ${questions?.size}")
}
