fun main(args:Array<String>){
    val book1 = Book("XYZ","Henry",200)
    val book2 = Book("ABC","Shubham")
    val book3 = Book("Will Power")
    val book4 = Book()


    book1.displayBook()
    book2.displayBook()
    book3.displayBook()
    book4.displayBook()
}

class Book(var bookName:String,var authorName:String,var price:Int = 100){
    lateinit var favBook : String

    constructor(bookName:String) : this(bookName,"UNKNOWN",10)

    constructor() : this("NONE","NONE",0)

    fun displayBook(){
        println("Book Name is : $bookName")
        println("Author Name is : $authorName")
        println("Price is : $price")

        println("\n")
    }
}