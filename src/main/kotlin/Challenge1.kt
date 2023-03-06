class Challenge1 {

    fun ContabilizaVotos(votos: IntArray): Int{
        val mapaVotos: MutableMap<Int, Int> = mutableMapOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0)
        votos.forEach {
            when(it){
                0 -> mapaVotos[it] = mapaVotos[it]!!.plus(1)
                1 -> mapaVotos[it] = mapaVotos[it]!!.plus(1)
                2 -> mapaVotos[it] = mapaVotos[it]!!.plus(1)
                3 -> mapaVotos[it] = mapaVotos[it]!!.plus(1)
                4 -> mapaVotos[it] = mapaVotos[it]!!.plus(1)
            }
        }
        val vencedor = mapaVotos.maxWith { x, y -> x.value.compareTo(y.value) }
        return vencedor.key
    }

    fun main() {
        val votos: IntArray = intArrayOf(0, 1, 2, 2, 4, 4, 3, 1, 2)
        when(ContabilizaVotos(votos)){
            0 -> println("O sabor com mais votos é o de flocos!!")
            1 -> println("O sabor com mais votos é o de chocolate!!")
            2 -> println("O sabor com mais votos é o de morango!!")
            3 -> println("O sabor com mais votos é o de creme!!")
            4 -> println("O sabor com mais votos é o de napolitano!!")
        }
    }

}