package com.LibraryManagementSystem.Controller;

import com.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{bookName}")
    public ResponseEntity<Book> getBookByTitles(@PathVariable("bookName") String bookName) {
        return ResponseEntity.ok().body(bookService.getBookInfoByTitle(bookName));
    }

    @GetMapping("/{authorName}")
    public ResponseEntity<Book> getBookByAuthorName(@PathVariable("authorName") String authorName){
        return ResponseEntity.ok().body(bookService.getBookInfoByAuthorName(authorName));
    }
}
