package com.LibraryManagementSystem.Service;

import com.LibraryManagementSystem.Entity.Member;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberService{

    public Member registerNewMember(Member member);

    public Optional<Member> getInformation(UUID memberId);

}
