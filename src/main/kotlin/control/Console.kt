
//Classe Console - responsavel somente por ler...
// e tratar dados e não retornar nada
//com o private constructor ninguém irá conseguir instanciar a classe Console
package control

class Console private constructor(){

    //com o companion object as funções pertencem ao escopo da CLASSE
    //o companion object ainda não impede de instanciar a
    // Console. Agora é, quero que alguém instancie a classe Console ou não?
    companion object{
        //função readLine() que irá retornar um inteiro
        fun readLine(msg: String): Int {
            //variavel retorno somente está no escopo da função readLine()
            var retorno: Int? = null

            //do está no escopo da impressão e validação da entrada de dados de idade
            do {
                print(msg)
                val info = readLine()


                //1º validação na classe Console
                if (info != null && info != "") {
                    retorno = info.toIntOrNull()


                    //2º validação na classe Console
                    if (retorno == null || retorno <= 0) {
                        println("Valor inválido!")
                    }


                    //caso o dado informado seja nulo ou vazio
                } else {
                    println("Valor inválido!")
                }
            } while (retorno == null || retorno <= 0)


            return retorno
        }

        //função readString
        fun readString(msg: String):String{


            //criação da variavel retorno do tipo string no escopo da função readString()
            var retorno:String?=null


            do {
                print(msg)
                val info = readLine()


                //valida se não há dado nulo ou vazio na variavel info
                if (info != null && info != "") {
                    retorno = info.lowercase()
                }else{
                    println("Valor inválido!")
                }

            }while (retorno == null)
            return retorno

        }
    }

}