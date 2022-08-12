package com.applecompose.trivia.domain.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.applecompose.trivia.data.DataOrException
import com.applecompose.trivia.data.model.QuestionItem
import com.applecompose.trivia.data.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
	private val api: QuestionApi
) {
	private val dataOrException =
		DataOrException<ArrayList<QuestionItem>,
				Boolean,
				Exception>()

	suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
		try {
			dataOrException.loading = true
			dataOrException.data = api.getAllQuestions()
			if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

		}catch (exception: Exception) {
			dataOrException.e = exception
			Log.d("EXCEPTION", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")


		}
		return dataOrException
	}



}