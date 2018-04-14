package org.kotlin99.logic

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun grayCodes(bits: Int): List<String> {
    TODO("Write here the implementation")
}

class P49Test {
    @Test fun `generate Gray code values`() {
        assertThat(grayCodes(bits = 1), equalTo(listOf("0", "1")))
        assertThat(grayCodes(bits = 2), equalTo(listOf("00", "01", "11", "10")))
        assertThat(grayCodes(bits = 3), equalTo(listOf("000", "001", "011", "010", "110", "111", "101", "100")))
    }
}
