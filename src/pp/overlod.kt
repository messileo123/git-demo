package pp

class PublicLibrary : Library() {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
        println("Added book: ${book.title} by ${book.author}")
    }

    override fun viewAllBooks() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            println("Books in the library:")
            for (book in books) {
                println("${book.title} by ${book.author}, published in ${book.year}")
            }
        }
    }

    override fun findBooksByAuthor(author: String) {
        val foundBooks = books.filter { it.author == author }
        if (foundBooks.isEmpty()) {
            println("No books found by author: $author")
        } else {
            println("Books by $author:")
            for (book in foundBooks) {
                println("${book.title}, published in ${book.year}")
            }
        }
    }
}