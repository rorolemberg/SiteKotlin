package br.com.site.imobiliario.service

import br.com.site.imobiliario.dto.TopicoDto
import br.com.site.imobiliario.model.Topico
import org.springframework.stereotype.Service
import kotlin.collections.ArrayList

@Service
class TopicoService (
    private var topicos: List<Topico> = ArrayList(),
    private val usuarioService: UsuarioService
    ) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }

    fun cadastrar(dto: TopicoDto) {
        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            autor = usuarioService.buscarPorId(dto.idAutor)
        )
        )
    }
}