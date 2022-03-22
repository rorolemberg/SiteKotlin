package br.com.site.imobiliario.repository

import br.com.site.imobiliario.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {
}