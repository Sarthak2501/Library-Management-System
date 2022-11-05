package com.LibraryManagementSystem.Service.ServiceImpl;

import com.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.Entity.Member;
import com.LibraryManagementSystem.Repository.BookRepository;
import com.LibraryManagementSystem.Repository.MemberRepository;
import com.LibraryManagementSystem.Service.LibrarianService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LibrarianServiceImpl implements LibrarianService {

    private final BookRepository bookRepository;

    private final MemberRepository memberRepository;


    @Override
    public void issueBookToMember(String memberName, String bookName) {
        Member member = memberRepository.findByMemberName(memberName);
        Book book = bookRepository.findByBookName(bookName);

        member.getBookList().add(book);

    }

    @Override
    public Book registerNewBookInLib(Book book) {
        Book bookOptional = bookRepository.findByBookName(book.getBookName());

        if (bookOptional != null){
            throw new IllegalStateException("book already present");
        }
        return bookRepository.save(book);
    }
}
