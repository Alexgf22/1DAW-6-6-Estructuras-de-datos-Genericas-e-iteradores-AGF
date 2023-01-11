interface Iterator<T> {
    fun iterando(elementos:MutableList<T>) {
        for(elemento in elementos) {
            print(elemento)
        }
    }
}

