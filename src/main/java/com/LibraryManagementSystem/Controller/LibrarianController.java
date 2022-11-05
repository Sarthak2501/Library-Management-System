package com.LibraryManagementSystem.Controller;


import com.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.Service.LibrarianService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/Librarian")
@RequiredArgsConstructor
public class LibrarianController {

    private final LibrarianService librarianService;

    @PostMapping("/{memberName}/Book")
    public ResponseEntity<?> addBookToMember(@RequestBody BookToMemberForm form){
        librarianService.issueBookToMember(form.getMemberName(), form.getBookName());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/books")
    public ResponseEntity<Book> saveRole(@RequestBody Book book) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/books").toUriString());
        return ResponseEntity.created(uri).body(librarianService.registerNewBookInLib(book));
    }


}

@Data
class BookToMemberForm{
    String memberName;
    String bookName;
}
