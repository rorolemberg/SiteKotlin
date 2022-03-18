package br.com.site.imobiliario.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
