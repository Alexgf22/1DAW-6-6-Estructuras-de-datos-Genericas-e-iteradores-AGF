class Pila<T>(
    private val elementos: MutableList<T> = mutableListOf<T>()
) : Iterador<T> {


    // devuelve el tamano de la lista
    private fun sizeList() : Int = this.elementos.size


    // devuelve el elemento en la cabeza de la pila.
    fun tope(): T? = this.elementos.first()


    // inserta en la lista el elemento que se le pasa como parametro
    fun push(elemento : T) {
        this.elementos.add(elemento)
    }


    // devuelve el ultimo elemento de la lista
    fun pop() : T = this.elementos.removeAt(this.elementos.lastIndex)


    /* si esta vacia (tope es nulo, o tamano es 0) o
       llena (si existe tamano maximo)
    */
    fun vacia(): Boolean {
        return sizeList() == 0 || tope() == null
    }

    override fun toString() = this.elementos.toString()
}



fun main() {
    val primerElemento = 1
    val segundoElemento = "hola"
    val tercerElemento = 3
    val cuartoElemento = true

    val elementos = Pila(mutableListOf<Any>())

    elementos.push(primerElemento)
    elementos.push(segundoElemento)
    elementos.push(tercerElemento)
    elementos.push(cuartoElemento)

    println("El primer elemento de la Pila es: ${elementos.tope()}")

    println(elementos.vacia())

    println(elementos)

    println("El ultimo elemento de la Pila es: ${elementos.pop()}")


}