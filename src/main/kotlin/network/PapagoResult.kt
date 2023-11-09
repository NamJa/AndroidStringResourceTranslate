package network

sealed class PapagoResult<T> {
    class Loading<T: Any>() : PapagoResult<T>()
    class Success<T: Any>(val data: T) : PapagoResult<T>()
    class Error<T: Any>(val code: String = "", val message: String = "") : PapagoResult<T>()
}