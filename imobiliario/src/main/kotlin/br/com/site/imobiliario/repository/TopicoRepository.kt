package br.com.site.imobiliario.repository

import br.com.site.imobiliario.model.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository: JpaRepository<Topico, Long> {
}