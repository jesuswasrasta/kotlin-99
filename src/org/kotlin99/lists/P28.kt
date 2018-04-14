package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> lengthSort(listOfLists: List<List<T>>): List<List<T>> {
    TODO("Write here the implementation")
}

fun <T> lengthFreqSort(listOfLists: List<List<T>>): List<List<T>> {
    TODO("Write here the implementation")
}

class P28Test {
    @Test fun `a) sort elements of the list according to their length`() {
        assertThat(
            lengthSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(), "mn".toList(), "o".toList())),
            equalTo(listOf("o".toList(), "de".toList(), "de".toList(), "mn".toList(), "abc".toList(), "fgh".toList(), "ijkl".toList()))
        )
    }

    @Test fun `b) sort elements according to their length frequency`() {
        assertThat(
            lengthFreqSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(), "mn".toList(), "o".toList())),
            equalTo(listOf("ijkl".toList(), "o".toList(), "abc".toList(), "fgh".toList(), "de".toList(), "de".toList(), "mn".toList()))
        )
    }
}
