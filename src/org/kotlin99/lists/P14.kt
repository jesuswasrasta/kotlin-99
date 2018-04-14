package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> duplicate(list: List<T>): List<T> {
    TODO("Write here the implementation")
}

class P14Test {
    @Test fun `duplicate the elements of a list`() {
        assertThat(duplicate("abccd".toList()), equalTo("aabbccccdd".toList()))
    }
}

