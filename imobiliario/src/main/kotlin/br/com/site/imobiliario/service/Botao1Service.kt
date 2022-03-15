package br.com.site.imobiliario.service

import br.com.site.imobiliario.model.Topico
import br.com.site.imobiliario.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class Botao1Service (private var topicos: List<Topico>) {

    init {
        val botao1 = Topico(
            id = 1,
            titulo = "teste",
            mensagem = "Teste Botao",
            autor = Usuario(
                id = 1,
                nome = "Rodrigo",
                categoria = "Teste"
            )
        )
        val botao2 = Topico(
            id = 2,
            titulo = "teste2",
            mensagem = "Teste Botao2",
            autor = Usuario(
                id = 1,
                nome = "Rodrigo",
                categoria = "Teste"
            )
        )
        val botao3 = Topico(
            id = 3,
            titulo = "teste3",
            mensagem = "Teste Botao3",
            autor = Usuario(
                id = 1,
                nome = "Rodrigo",
                categoria = "Teste"
            )
        )

        topicos =  Arrays.asList(botao1, botao2, botao3)
    }
    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }
}