package br.com.site.imobiliario.service

import br.com.site.imobiliario.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(var usuarios: List <Usuario>) {

    init {
        val usuario = Usuario(
                    id = 1,
                    nome = "Rodrigo"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario{
        return usuarios.stream().filter({
            u -> u.id == id
        }).findFirst().get()
    }

}
