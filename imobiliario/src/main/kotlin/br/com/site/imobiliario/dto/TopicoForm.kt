package br.com.site.imobiliario.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class TopicoForm (
        @field:NotEmpty(message = "Nao pode ser em branco")
        @field:Size(min = 1, max = 100, message = "Titulo de deve ter no maximo 100")
        val titulo: String,
        @field:NotEmpty
        @field:Size(min = 1, max = 100)
        val mensagem: String,
        val idAutor: Long
)
