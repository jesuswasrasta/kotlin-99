@file:Suppress("NOTHING_TO_INLINE", "unused")

package org.kotlin99.logic

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

inline fun Boolean.not_(): Nothing = TODO("Write here the implementation")
inline fun Boolean.and_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.or_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.nand_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.nor_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.xor_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.equ_(other: Boolean): Nothing = TODO("Write here the implementation")
inline fun Boolean.impl_(other: Boolean): Nothing = TODO("Write here the implementation")

fun truthTable(f: (Boolean, Boolean) -> Boolean): List<Row> {
    return listOf(Pair(true, true), Pair(true, false), Pair(false, true), Pair(false, false)).map {
        Row(it.first, it.second, f(it.first, it.second))
    }
}

fun printTruthTable(f: (Boolean, Boolean) -> Boolean) {
    println(listOf("a", "b", "result").joinToString("\t"))
    truthTable(f).forEach {
        println(listOf(it.a, it.b, it.result).joinToString("\t"))
    }
}

data class Row(val a: Boolean, val b: Boolean, val result: Boolean)


class P46Test {
    @Test fun `logical expressions`() {
        assertThat(true.and_(true), equalTo(true))
        assertThat(true.xor_(true), equalTo(false))
    }

    @Test fun `truth tables for logical expressions`() {
        assertThat(truthTable(Boolean::and_), equalTo(listOf(
            Row(true, true, true),
            Row(true, false, false),
            Row(false, true, false),
            Row(false, false, false)
        )))
        assertThat(truthTable(Boolean::xor_), equalTo(listOf(
            Row(true, true, false),
            Row(true, false, true),
            Row(false, true, true),
            Row(false, false, false)
        )))
        assertThat(truthTable(Boolean::equ_), equalTo(listOf(
            Row(true, true, true),
            Row(true, false, false),
            Row(false, true, false),
            Row(false, false, true)
        )))

        printTruthTable { a, b -> a.and_(a.or_(b.not_())) }
        assertThat(truthTable { a, b -> a.and_(a.or_(b.not_())) }, equalTo(listOf(
            Row(true, true, true),
            Row(true, false, true),
            Row(false, true, false),
            Row(false, false, false)
        )))
    }
}
