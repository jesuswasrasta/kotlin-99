package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import org.kotlin99.common.tail
import java.util.NoSuchElementException

tailrec fun <T> nth(n: Int, list: List<T>): T {
    TODO("Write here the implementation")
}

class P03Test {
    @Test fun `find the Nth element of a list`() {
        assertThat(nth(2, listOf(1, 1, 2, 3, 5, 8)), equalTo(2))
    }

    @Test(expected = NoSuchElementException::class)
    fun `Nth element outside of list size`() {
        nth(100, listOf(1, 1, 2, 3, 5, 8))
    }
}