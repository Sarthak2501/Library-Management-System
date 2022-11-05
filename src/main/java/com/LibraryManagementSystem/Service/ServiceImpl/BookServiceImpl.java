package com.LibraryManagementSystem.Service.ServiceImpl;

import com.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.Repository.BookRepository;
import com.LibraryManagementSystem.Service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class BookServiceImpl implements BookService {

//
//    private final MemberRepository memberRepository;
//
//    private final LibrarianRepository librarianRepository;

    private final BookRepository bookRepository;

    @Override
    public Book getBookInfoByTitle(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @Override
    public Book getBookInfoByAuthorName(String authorName) {
        return bookRepository.findByAuthorName(authorName);
    }

//    @Override
//    public Book getBookInfoByPublicationDate(LocalDate PublishedDate) {
//        return bookRepository.findByPublishedDate(PublishedDate);
//    }
}
