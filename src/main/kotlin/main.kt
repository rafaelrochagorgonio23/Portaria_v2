/*
//Classe Console - responsavel somente por ler dados e não retorna nada

fun main() {
    Portaria()
}

// Função portaria usada para consulta
fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    //1º validação de entrada de dados na função portaria()
    if (idade != null && idade != "") {

        //2º validação de entrada de dados na função portaria()
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }


    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    //3º validação de entrada de dados na função portaria()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()


        //4º Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        }


        print("Qual o código do convite? ")
        var codigo = readLine()


        //5º validação de entrada de dados na função portaria()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()


            //6º validação de entrada de dados na função portaria()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")


            //7º validação de entrada de dados na função portaria()
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")) {
                println("Welcome :)")


            //8º validação de entrada de dados na função portaria()
            } else {
                println("Negado. entity.Convite inválido")
            }
        }
    }
}
*/