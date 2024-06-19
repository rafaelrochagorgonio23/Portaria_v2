package business

import entity.Convidado

class ConvidadoBusiness {
    //--------------------------------------------------------------------------------
    //função tipoValido() - retorna string
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    //função maiorDeIdade() - retorna inteiro
    fun maiorDeIdade(idade: Int) = idade < 18


    //função codigoValido - Convite sendo referenciado pela classe Convite em grupo entity
    fun convidadoValido(convidado: Convidado): Boolean = when (convidado.tipo) {
            "comum" -> convidado.codigo.startsWith("xt")

            //when permite comparar dois valores
            "premium", "luxo"-> convidado.codigo.startsWith("xl")
            else -> false
            }
        }




