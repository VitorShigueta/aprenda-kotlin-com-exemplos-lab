
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nomeString, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {


    
    fun matricular(usuario: Usuario) {
    }
}

fun main() {
    println("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    println("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
