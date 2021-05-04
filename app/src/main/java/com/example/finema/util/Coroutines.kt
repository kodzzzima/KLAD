package com.example.finema.util

import com.example.finema.models.Movie
import com.example.finema.models.MovieResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

object Coroutines {

    private val dataSet = ArrayList<Movie>()
    private lateinit var resp: MovieResponse

    fun ioThenMain(work: suspend (() -> MovieResponse?), callback: ((MovieResponse?)->Unit)) =
        CoroutineScope(Dispatchers.Main).launch {
            val data = CoroutineScope(Dispatchers.IO).async  rt@{
                return@rt work()
            }.await()
            data?.movies.let {
                data?.movies = it?.shuffled()!!
            }
            dataSet.addAll(data!!.movies)
            resp = MovieResponse(dataSet)
            callback(resp)
        }
}