package com.example.study.demo.service;

import com.example.study.demo.model.Member;
import com.example.study.demo.model.Team;
import com.example.study.demo.model.request.MemberRequest;
import com.example.study.demo.model.request.TeamRequest;
import com.example.study.demo.repository.MemberRepository;
import com.example.study.demo.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {

    private MemberRepository memberRepository;
    private TeamRepository teamRepository;

    public Optional<Member> findMember(String id) {
        return memberRepository.findById(id);
    }

    public void saveMember(MemberRequest request) {
        memberRepository.save(
                Member.builder()
                        .id(request.getId())
                        .team(teamRepository.findById(request.getTeamId()).orElse(null))
                        .userName(request.getUserName())
                        .address(request.getAddress())
                        .phoneNo(request.getPhoneNo())
                        .gender(request.getGender())
                        .registerId(request.getRegisterId())
                        .build()
        );
    }

    public Optional<Team> findTeam(Long id) {
        return teamRepository.findById(id);
    }

    public void saveTeam(TeamRequest request) {
        teamRepository.save(
                Team.builder()
                        .name(request.getName())
                        .registerId(request.getRegisterId())
                        .build()
        );
    }
}
