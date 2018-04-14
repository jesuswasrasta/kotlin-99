package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

fun <T> randomSelect(n: Int, list: List<T>, random: Random = Random()): List<T> {
    TODO("Write here the implementation")
}

class P23Test {
    @Test fun `extract a given number of randomly selected elements from a list`() {
        assertThat(randomSelect(3, "abcdefgh".toList(), Random(123)), equalTo("chf".toList()))
    }
}

