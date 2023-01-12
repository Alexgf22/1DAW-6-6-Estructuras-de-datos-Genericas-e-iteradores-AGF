/**
 * La clase Pila generica le pongo de Tipo T queriendo decir de que puede ser
 * de cualquier tipo.
 *
 * @property elementos MutableList<T>  Diversos datos que puede contener la lista
 * que pueden ser de nuevo de cualquier tipo.
 */
class Pila<T>(
    private val elementos: MutableList<T> = mutableListOf()
) : Iterable<T> {



    /**
     * Esta funcion calcula el tamano de la lista.
     *
     * @return Int devuelve el numero de elementos de la lista.
     */
    private fun sizeList() : Int = this.elementos.size



    /**
     * La funcion lo que hace es llamar al metodo first() de una lista mutable
     * para saber cual es el elemento que se encuentra primero en la lista.
     *
     * @return T? devuelve el elemento que se encuentra en la cabeza de la pila
     * que puede ser de cualquier tipo.
     */
    fun tope(): T? = this.elementos.first()



    /**
     * La funcion lo que hace es insertar en la lista mutable en el indice 0 un elemento que puede
     * ser de cualquier tipo.
     *
     * @param elemento que puede ser de cualquier tipo.
     */
    fun push(elemento : T) {
        this.elementos.add(0,elemento)
    }



    /**
     * La funcion lo que hace es sacar de la lista el elemento que se encuentra
     * en el ultimo indice.
     *
     * @return T devuelve el ultimo elemento de la lista.
     */
    fun pop() : T = this.elementos.removeAt(this.elementos.lastIndex)


    /* si esta vacia (tope es nulo, o tamano es 0) o
       llena (si existe tamano maximo)
    */
    /**
     * La funcion comprueba llamando a la funcion sizeList() si el tamano de la
     * lista es 0 o si la funcion tope() es nula .
     *
     * @return Boolean devuelve true si se cumple alguna de las 2 condiciones
     * mencionadas anteriormente. En caso contrario, devuelve false.
     */
    fun vacia(): Boolean {
        return sizeList() == 0 || tope() == null
    }


    /**
     * La funcion crea una copia de la lista para ir eliminando los elementos
     * de ahi y crea otra lista donde se iran introduciendo los elementos.
     * Despues va recorriendo los indices de lista y en cada uno mete en la lista
     * del reves en ese mismo indice el ultimo elemento que haya en la lista copia.
     *
     * @return MutableList<T> devuelve la lista del reves.
     */
    fun <T> reverse(lista: MutableList<T>): MutableList<T> {

        val listaReves = mutableListOf<T>()
        // Si la lista está vacía o solo queda un elemento
        if (lista.size <= 1) {
            println("No hay elementos suficientes para poder darle la vuelta a la lista")
        }


        else {
            val listIterator = lista.listIterator()
            while (listIterator.hasNext()) listIterator.next()
            while (listIterator.hasPrevious()) {
                listaReves.add(listIterator.previous())
            }
        }
        return listaReves


    }


    override fun iterator(): Iterator<T> {
        return elementos.iterator()
    }


    override fun toString() = this.elementos.toString()


    }





fun main() {

    /* Prueba con if y el equals para comprobar si la cadena al reves es igual
       a la cadena al reves pero pasandole esta vez la funcion para darle la vuelta.
     */

    val numbers = mutableListOf("one", "two", "three", "four")
    val numerosPila = Pila(numbers)

    val numbersRev = numerosPila.reverse(numbers)

    if (listOf("four","three","two","one") != numbersRev) {
        println("Error")
    }
    else {
        println("Correcto")
    }

    println(numbersRev)


    println("A continuacion se realizara la segunda prueba")

    /* Segunda prueba probando a meter elementos, sacar el primer elemento de la pila,
    * eliminar elemento, darle la vuelta a la pila y comprobar tambien si esta vacia */
    val elementosVariados  = mutableListOf<Any>(true,3,"hola",1)

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

    println("La lista al reves seria: ${elementos.reverse(elementosVariados)}")



}