package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LibraryBookRepository libraryBookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public List<LibraryBook> getAllLibraryBooks() {
        return libraryBookRepository.findAll();
    }

    public Optional<LibraryBook> getLibraryBookById(Long id) {
        return libraryBookRepository.findById(id);
    }

    public LibraryBook createLibraryBook(LibraryBook libraryBook) {
        return libraryBookRepository.save(libraryBook);
    }

    public LibraryBook updateLibraryBook(LibraryBook libraryBook) {
        return libraryBookRepository.save(libraryBook);
    }

    public void deleteLibraryBook(Long id) {
        libraryBookRepository.deleteById(id);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return bookRepository.findByAuthorContaining(author);
    }

    public List<LibraryBook> searchLibraryBooksByTitle(String title) {
        return libraryBookRepository.findByTitleContaining(title);
    }

    public List<LibraryBook> searchLibraryBooksByAuthor(String author) {
        return libraryBookRepository.findByAuthorContaining(author);
    }
}