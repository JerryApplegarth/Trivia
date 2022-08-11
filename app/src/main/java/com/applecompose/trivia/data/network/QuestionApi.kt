package com.applecompose.trivia.data.network

import com.applecompose.trivia.data.model.Question
import com.applecompose.trivia.presentation.utils.Constants
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

	@GET(Constants.END_POINT)
	suspend fun getAllQuestions(): Question
}