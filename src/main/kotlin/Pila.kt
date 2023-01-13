/**
 * La clase Pila generica le pongo de Tipo T queriendo decir de que puede ser
 * de cualquier tipo.
 *
 * @property elementos MutableList<T>  Diversos datos que puede contener la lista
 * que pueden ser de nuevo de cualquier tipo.
 */
class Pila<T> {

    /* Aqui se crea la variable lista para no pasarla la lista como parametro en un constructor
       secundario en la Pila para que no se sepa lo que contiene la Pila y de esa forma si se borra
       la lista no se carga todos los metodos de la Pila.

     */
    private val elementos: MutableList<T> = mutableListOf()


    /**
     * La funcion lo que hace es llamar al metodo first() de una lista mutable
     * para saber cual es el elemento que se encuentra primero en la pila.
     *
     * @return T? devuelve el elemento que se encuentra en la cabeza de la pila
     * que puede ser de cualquier tipo.
     */
    fun tope(): T? = elementos.lastOrNull()



    /**
     * La funcion lo que hace es insertar en la pila en orden un elemento que puede
     * ser de cualquier tipo.
     *
     * @param elemento que puede ser de cualquier tipo.
     */
    fun push(elemento: T) {
        elementos.add(elemento)

    }



    /**
     * La funcion lo que hace es sacar de la pila el elemento que se encuentra
     * en el ultimo indice.
     *
     * @return T devuelve el ultimo elemento de la pila.
     */
    fun pop() : T = elementos.removeAt(elementos.lastIndex)


    /* si esta vacia (tope es nulo, o tamano es 0) o
       llena (si existe tamano maximo)
    */
    /**
     * La funcion comprueba  si el tamano de la
     * pila es 0 o si la funcion tope() es nula .
     *
     * @return Boolean devuelve true si se cumple alguna de las 2 condiciones
     * mencionadas anteriormente. En caso contrario, devuelve false.
     */
    fun vacia(): Boolean {
        //return sizeList() == 0 || tope() == null
        return elementos.isEmpty()
    }



    override fun toString() = elementos.toString()


    }




/**
 *
 *
 * @return MutableList<T> devuelve la lista del reves.
 */
fun <T> reverse(lista: MutableList<T>): MutableList<T> {

    // Aqui se crea la Pila vacia para hacer uso de los metodos que tiene
    val pila = Pila<T>()

    val listaReves = mutableListOf<T>()

    // Si la lista está vacía o solo queda un elemento
    if (lista.size <= 1) {
        println("No hay elementos suficientes para poder darle la vuelta a la lista")
    }


    else {
        val iterator = lista.iterator()
        while (iterator.hasNext()) {
            pila.push(iterator.next())
        }

        lista.forEach { _ ->
            listaReves.add(pila.pop())
        }


    }

    return listaReves


}





fun main() {

    /* Prueba con if y el equals para comprobar si la cadena al reves es igual
       a la cadena al reves pero pasandole esta vez la funcion para darle la vuelta.
     */

    val numbers = mutableListOf("one", "two", "three", "four")

    val numbersRev = reverse(numbers)

    if (listOf("four","three","two","one") != numbersRev) {
        println("Error")
    }
    else {
        println("Correcto")
    }

    println(numbersRev)


    println("A continuacion se realizara la segunda prueba")




}