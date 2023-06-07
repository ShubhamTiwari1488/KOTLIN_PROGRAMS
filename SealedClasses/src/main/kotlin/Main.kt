//SEALED CLASS

fun main(args: Array<String>) {

    val success = Result.Success("SUCCESS!")
    //val error = Result.Error("FAILED!")
    val progress = Result.Progress("PROGRESS!")

    getData(success)
    //getData(error)
    getData(progress)

}

fun getData(result : Result){
    when(result){
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
    }
}

sealed class Result(private val message: String) {

    fun showMessage() {
        println("Result : $message")
    }
    class Success(message: String) : Result(message)

    sealed class Error(message: String) : Result(message){
        class RecoverableError(exception : Exception,message:String):Error(message)
        class NonRecoverableError(exception : Exception,message : String) : Error(message)
    }

    class Progress(message: String) : Result(message)
}