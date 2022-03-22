package br.com.site.imobiliario.service

import br.com.site.imobiliario.model.Usuario
import br.com.site.imobiliario.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario{
        return repository.getOne(id)
    }

}
