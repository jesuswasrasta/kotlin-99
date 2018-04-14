package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

tailrec fun <T> isPalindrome(list: List<T>): Boolean {
    TODO("Write here the implementation")
}

@Suppress("unused")
fun <T> isPalindrome_(list: List<T>) = list == list.asReversed()

class P06Test {
    @Test fun `find out whether a list is a palindrome`() {
        assertThat(isPalindrome(listOf<Int>()), equalTo(true))
        assertThat(isPalindrome(listOf(1)), equalTo(true))
        assertThat(isPalindrome(listOf(1, 2)), equalTo(false))
        assertThat(isPalindrome(listOf(1, 2, 1)), equalTo(true))
        assertThat(isPalindrome(listOf(1, 2, 2, 1)), equalTo(true))
    }
}