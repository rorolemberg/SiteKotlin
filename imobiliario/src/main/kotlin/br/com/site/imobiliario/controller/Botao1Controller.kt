package br.com.site.imobiliario.controller

import br.com.site.imobiliario.model.Topico
import br.com.site.imobiliario.service.Botao1Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class Botao1Controller(private val service: Botao1Service) {

    @GetMapping
    fun acionar(): List<Topico> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return service.buscarPorId(id)
    }

}