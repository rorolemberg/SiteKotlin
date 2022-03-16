package br.com.site.imobiliario.controller

import br.com.site.imobiliario.dto.TopicoDto
import br.com.site.imobiliario.model.Topico
import br.com.site.imobiliario.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun acionar(): List<Topico> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: TopicoDto){
        service.cadastrar(dto)
    }

}