package io.aikosoft.midterm

import java.io.Serializable

data class App(
        val name: String = "",
        val description: String = "",
        val rating: String = "",
//        val status: String = "",
        val imgRes: Int = -1,
        val imgRating: Int = 0
) : Serializable