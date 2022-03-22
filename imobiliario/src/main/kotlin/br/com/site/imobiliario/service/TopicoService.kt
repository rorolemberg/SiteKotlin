package br.com.site.imobiliario.service

import br.com.site.imobiliario.dto.AtualizacaoTopicoForm
import br.com.site.imobiliario.dto.TopicoForm
import br.com.site.imobiliario.dto.TopicoView
import br.com.site.imobiliario.exception.NotFoundException
import br.com.site.imobiliario.mapper.TopicoFormMappper
import br.com.site.imobiliario.mapper.TopicoViewMapper
import br.com.site.imobiliario.model.Topico
import br.com.site.imobiliario.repository.TopicoRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
    private val repository: TopicoRepository,
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMappper,
    private val notFoundMessage: String = "Topico nao encontrado"
) {

    fun listar(): List<TopicoView> {
        return repository.findAll().stream().map { t ->
            topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = repository.findById(id)
            .orElseThrow{NotFoundException(notFoundMessage)}
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: TopicoForm): TopicoView {
        val topico = topicoFormMapper.map(form)
        repository.save(topico)
        return topicoViewMapper.map(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm): TopicoView {
        val topico = repository.findById(form.id)
            .orElseThrow{NotFoundException(notFoundMessage)}
        topico.titulo = form.titulo
        topico.mensagem = form.mensagem
        return topicoViewMapper.map(topico)
    }

    fun deletar(id: Long) {
       repository.deleteById(id)
    }
}