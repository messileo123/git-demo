package pp
fun main(){
val library = PublicLibrary()


library.addBook(Book("footbal", "messi", 2024))
library.addBook(Book("demaria", "argentina", 2024))
library.addBook(Book("To Kill a Mockingbird", "Harper Lee", 1960))


library.viewAllBooks()

}
