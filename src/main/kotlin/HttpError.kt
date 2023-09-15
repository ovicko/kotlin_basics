sealed class HttpError{
    data class NotFound(val errorCode:Int):HttpError()
    data class BadGateway(val errorCode:Int):HttpError()
    data class BadRequest(val errorCode:Int):HttpError()
    data class UnAuthorized(val errorCode:Int):HttpError()
    data class Wilderness(val errorCode:Int):HttpError()
}

fun errorBody(error: HttpError): ErrorDTO = when(error) {
    is HttpError.NotFound-> ErrorDTO(error.errorCode,"Error: ${error.errorCode}, Not Found")
    is HttpError.BadGateway-> ErrorDTO(error.errorCode,"Error: ${error.errorCode}: BadGateway")
    is HttpError.BadRequest-> ErrorDTO(error.errorCode,"Error: ${error.errorCode}: BadRequest")
    is HttpError.UnAuthorized-> ErrorDTO(error.errorCode,"Error: ${error.errorCode}: UnAuthorized")
    is HttpError.Wilderness -> ErrorDTO(error.errorCode,"Error: ${error.errorCode}: Bro, you're in the wild!")
}

data class ErrorDTO(var code:Int,var message:String) {
    var httpCode:Int = code
    var httpMessage:String = message

}

fun main() {
    val errorBody: ErrorDTO = errorBody(HttpError.Wilderness(406))

    println(errorBody.httpMessage)
}
