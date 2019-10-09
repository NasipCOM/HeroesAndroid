package io.aikosoft.cardsdemo

import java.io.Serializable

data class Fruit(
        val name: String = "",
        val description: String = "",
        val imgRes: Int = -1
) : Serializable