class Pila<T> {
    // Lista mutable de elementos de cualquier tipo
    private val elementos = mutableListOf<T>()

    // devuelve el tamano de la lista
    private fun sizeList() : Int = this.elementos.size


    // devuelve el elemento en la cabeza de la pila.
    fun tope(): T = this.elementos.first()


    // inserta en la lista el elemento que se le pasa como parametro
    fun push(elemento : T) {
        this.elementos.add(elemento)
    }


    // devuelve el ultimo elemento de la lista
    fun pop() : T = this.elementos.removeAt(this.elementos.lastIndex)


    override fun toString() = this.elementos.toString()
}