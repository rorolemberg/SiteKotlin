package br.com.site.imobiliario.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class AtualizacaoTopicoForm (
        @field:NotNull
        val id: Long,
        @field:NotEmpty
        @field:Size(min = 1, max = 10)
        val titulo: String,
        @field:NotEmpty
        @field:Size(min = 1, max = 10)
        val mensagem: String
        )
