package br.com.site.imobiliario.mapper

import br.com.site.imobiliario.dto.TopicoForm
import br.com.site.imobiliario.model.Topico
import br.com.site.imobiliario.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMappper(
    private val usuarioService: UsuarioService
) : Mapper<TopicoForm, Topico> {
    override fun map(t: TopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}

