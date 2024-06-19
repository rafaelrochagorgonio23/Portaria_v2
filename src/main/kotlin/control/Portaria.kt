//aponta para a classe ConviteBusiness() para validar

package control

import business.ConvidadoBusiness
import entity.Convidado

/*do modo que está sendo construido, está sendo retirado tudo da
função portaria() e passando tudo há orientação a objetos
*/

/*Classe Portaria - responsavel por coordenar as coisas no programa Portaria*/
class Portaria {

    /*Instancia a variavel conviteBusiness para que a classe ConviteBusiness
     seja RESPONSAVEL por executar a função de validar o tipo do convite*/
    private val convidadoBusiness = ConvidadoBusiness()

    /*init retira a necessidade de chamar a função controle como subchamada do main
     não há necessidade de incluir this.controle() porque só existe uma função controle()*/
    init {
        println("Portaria inicializada")
        println(controle())
    }

    /*cria a VARIAVEL console - só a classe Portaria tem acesso a variavel console
    private val console = Console()*/

    /*ATENÇÃO COMENTÁRIO LINHA 56 - para função abaixo validação se o tipo NÃO FOR VALIDO -
    O USO DA FUNÇÃO ESTÁ DUPLICADO E ERRADO,
    // MAS MUITO TEMPO PARADO PARA RESOLVER O PROBLEMA IMPEDINDO O ANDAMNETO DO CURSO

    função controle - como não tem nenhum objeto chamado o controle externamente
     pode-se deixar ela (a função) em modo privado*/
    private fun controle(): String {

        //INICIALIZAÇÃO PRINCIPAL DO PROGRAMA
        val idade = Console.readLine("Qual sua idade?")
        val convidado = Convidado(idade = idade)

        /*MUITA ATENÇÃO NESTA DECLARAÇÃO com - COMENDO BOLA VARIAS VEZES AQUI
        * convidadoBusiness = variavel
        * ConvidadoBusiness = Instancia da classe ConvidadoBusiness
        *
        * MODELAGEM DA ESTRUTURA:
        * VARIAVEL DA INSTANCIA DA CLASSE.nome da função presente na classe(atributos da função presente na classe)
        *
        * para caso o convidado seja maior de idade o resultado...
        * da sentença será True caso contrário false
        * */
        if (convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de idade não são permitidos."
        }

        //Código1
        convidado.tipo = Console.readString("Qual é o tipo de convite? ")

        //validação se o tipo NÃO FOR VALIDO
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido."
        }

        //validação tipo de convite por categoria | comum xt | premium, luxo xl
        convidado.codigo = Console.readString("Qual o código do convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)){
            return "Negado. Convite inválido."
        }

        return "Welcome :)"
    }
}


