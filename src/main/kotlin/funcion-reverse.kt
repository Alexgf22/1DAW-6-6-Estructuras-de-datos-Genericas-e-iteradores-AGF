interface Iterador<T> {
    fun recorrido(elementos:MutableList<T>): Boolean {
        for(elemento in elementos) {
            print(elemento)
        }
        return true
    }
}