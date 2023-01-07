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

    /*override fun recorrido(elementos: MutableList<T>) {
        super.recorrido(elementos)
    }*/

    fun reverse(): MutableList<T> {
        return (elementos).asReversed()
    }

    override fun toString() = this.elementos.toString()
}



fun main() {

    /* Prueba con if y el equals para comprobar si la cadena al reves es igual
       a la cadena al reves pero pasandole esta vez la funcion para darle la vuelta.
     */

    val numbers = Pila(mutableListOf<Any>("one", "two", "three", "four"))
    val numbersRev = numbers.reverse()
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)


    println("A continuacion se realizara la segunda prueba")
    /* Segunda prueba probando a meter elementos, sacar el primer elemento de la pila,
    * eliminar elemento, darle la vuelta a la pila y comprobar tambien si esta vacia */
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

    println("La lista al reves seria: ${elementos.reverse()}")



}