interface Iterador<T> {
    fun recorrido(elementos:MutableList<T>) {
        for(elemento in elementos) {
            print(elemento)
        }
    }
}