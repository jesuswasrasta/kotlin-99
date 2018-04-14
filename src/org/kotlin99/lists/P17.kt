package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> split(n: Int, list: List<T>): Pair<List<T>, List<T>> {
    TODO("Write here the implementation")
}

class P17Test {
    @Test fun `split a list into two parts`() {
        assertThat(split(3, "abcdefghijk".toList()), equalTo(Pair("abc".toList(), "defghijk".toList())))
    }
}
