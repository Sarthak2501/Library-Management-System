package com.LibraryManagementSystem.Service.ServiceImpl;

import com.LibraryManagementSystem.Entity.Member;
import com.LibraryManagementSystem.Repository.MemberRepository;
import com.LibraryManagementSystem.Service.MemberService;
import com.fasterxml.jackson.annotation.OptBoolean;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;


    @Override
    public Member registerNewMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Optional<Member> getInformation(UUID memberId) {
        return memberRepository.findById(memberId);
    }
}
