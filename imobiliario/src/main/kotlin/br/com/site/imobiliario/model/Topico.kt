package br.com.site.imobiliario.model

import java.time.LocalDateTime

data class Topico (
    var id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario

        )