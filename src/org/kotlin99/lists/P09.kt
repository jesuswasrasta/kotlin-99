package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> pack(list: List<T>): List<List<T>> {
    TODO("Write here the implementation")
}

class P09Test {
    @Test fun `pack consecutive duplicates of list elements into sublists`() {
        assertThat(pack("a".toList()), equalTo(listOf("a".toList())))
        assertThat(pack("aaa".toList()), equalTo(listOf("aaa".toList())))
        assertThat(pack("aaaabccaadeeee".toList()), equalTo(listOf(
            "aaaa".toList(), "b".toList(), "cc".toList(), "aa".toList(), "d".toList(), "eeee".toList()
        )))
    }
}