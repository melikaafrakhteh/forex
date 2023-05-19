package com.melika.data.mapper

interface ModelMapper <first, second>{
    fun mapToFirst(second: second): first
    fun mapToSecond(first: first): second
}