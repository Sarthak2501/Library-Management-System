package com.LibraryManagementSystem.Controller;


import com.LibraryManagementSystem.Entity.Member;
import com.LibraryManagementSystem.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping()
    public ResponseEntity<Member> registerMember(@RequestBody Member member){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1").toUriString());
        return ResponseEntity.created(null).body(memberService.registerNewMember(member));
    }

    @GetMapping()
    public ResponseEntity<Optional<Member>> getUsers(UUID memberID) {

        return ResponseEntity.ok().body(memberService.getInformation(memberID));
    }

}
