package com.example.triviaapp.screen

import android.util.Log
import androidx.compose.runtime.Composable


@Composable
fun Questions(
    viewModel: QuestionsViewModel
) {
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true) {
        Log.d("Loading", "Questions: Loading...")
    } else {
        Log.d("Loading", "Questions: Loading Stopped...")
        questions?.forEach { questionItem ->
            Log.d("Result", "Questions: ${questionItem.question}")
        }
    }
}
