package org.kotlin99.lists

import com.natpryce.hamkrest.anyElement
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import org.kotlin99.common.containsAll
import org.kotlin99.common.tail

fun <T> group3(list: List<T>): List<List<List<T>>> {
    TODO("Write here the implementation")
}

fun <T> group(sizes: List<Int>, list: List<T>): List<List<List<T>>> {
    TODO("Write here the implementation")
}


class P27Test {
    @Test fun `a) group the elements into 3 disjoint subgroups of 2, 3 and 4`() {
        val groups = group3(listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
        // groups.forEach { println(it) }
        assertThat(groups, anyElement(containsAll(
            listOf(listOf("Aldo", "Beat"), listOf("Carla", "David", "Evi"), listOf("Flip", "Gary", "Hugo", "Ida"))
        )))
        assertThat(groups.size, equalTo(1260))
    }

    @Test fun `b) group the elements into disjoint subgroups of specified sizes`() {
        val groups = group(listOf(2, 2, 5), listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
        // groups.forEach { println(it) }
        assertThat(groups, anyElement(containsAll(
            listOf(listOf("Aldo", "Beat"), listOf("Carla", "David"), listOf("Evi", "Flip", "Gary", "Hugo", "Ida"))
        )))
        assertThat(groups.size, equalTo(756))

    }
}
