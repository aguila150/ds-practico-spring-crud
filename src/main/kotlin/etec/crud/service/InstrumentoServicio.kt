
package etec.crud.service

import Instrumento
import org.springframework.stereotype.Service

@Service
class InstrumentoServicio {
    private val instrumentos = mutableListOf<Instrumento>()

    fun guardar(instrumento: Instrumento): Instrumento {
        this.instrumentos.add(instrumento)
        return instrumento
    }

    fun listarTodos() = this.instrumentos.toList()
}
