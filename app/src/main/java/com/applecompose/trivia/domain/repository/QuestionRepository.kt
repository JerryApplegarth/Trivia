package com.applecompose.trivia.domain.repository

import com.applecompose.trivia.data.DataOrException
import com.applecompose.trivia.data.model.QuestionItem
import com.applecompose.trivia.data.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
	private val api: QuestionApi
) {
	private val listOfQuestions =
		DataOrException<ArrayList<QuestionItem>,
				Boolean,
				Exception>()



}