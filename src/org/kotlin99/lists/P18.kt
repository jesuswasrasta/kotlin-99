package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import org.kotlin99.common.tail

fun <T> slice(from: Int, to: Int, list: List<T>): List<T> {
    TODO("Write here the implementation")
}

@Suppress("unused")
fun <T> slice_(from: Int, to: Int, list: List<T>) = list.subList(from, to)

class P18Test {
    @Test fun `extract a slice from a list`() {
        assertThat(slice(3, 7, "abcdefghijk".toList()), equalTo("defg".toList()))
    }
}
