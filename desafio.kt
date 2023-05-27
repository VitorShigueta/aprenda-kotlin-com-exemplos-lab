enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String, val id: Long) {
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario);
    }

    fun cancelarMatricula(usuario: Usuario) {
        inscritos.remove(usuario);
    }

}

fun main() {
    //Criação de cursos
    val curso1 = ConteudoEducacional("Lógica", 20);
    val curso2 = ConteudoEducacional("Programação", 20);
    val curso3 = ConteudoEducacional("Framework", 20);

    //Lista de cursos
    val cursos: MutableList<ConteudoEducacional> = mutableListOf();

    //Adicionando cursos a lista
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);

    //Criando uma formação
    val formacao = Formacao("Primeira formação", cursos, Nivel.BASICO);

    println(formacao)

    //Criando um ususario
    val usuario1 = Usuario("Fulano", 123);
    val usuario2 = Usuario("Ciclano", 1231);

    //Matriculando usuarios na formação
    formacao.matricular(usuario1);
    formacao.matricular(usuario2);

    println(formacao.inscritos);

    //Excluindo um aluno
    formacao.cancelarMatricula(usuario1);

    println(formacao.inscritos);
}
