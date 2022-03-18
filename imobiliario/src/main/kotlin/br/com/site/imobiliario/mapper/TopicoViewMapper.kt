package br.com.site.imobiliario.mapper

import br.com.site.imobiliario.dto.TopicoView
import br.com.site.imobiliario.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoViewMapper: Mapper<Topico, TopicoView> {

    override fun map(t: Topico): TopicoView {
        return TopicoView (
        id = t.id,
        titulo = t.titulo,
        mensagem = t.mensagem,
        dataCriacao = t.dataCriacao
        )
    }
}