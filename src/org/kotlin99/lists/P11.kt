package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

@Suppress("IMPLICIT_CAST_TO_ANY")
// Note that T has upper bound of Any (not nullable value)
fun <T: Any> encodeModifies(list: List<T>): List<Any> {
    TODO("Write here the implementation")
}

class P11Test {
    @Test fun `modified run-length encoding`() {
        assertThat(encodeModifies("aaaabccaadeeee".toList()), equalTo(listOf<Any>(
            Pair(4, 'a'), 'b', Pair(2, 'c'), Pair(2, 'a'), 'd', Pair(4, 'e')
        )))
    }
}