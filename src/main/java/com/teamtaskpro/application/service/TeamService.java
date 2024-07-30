package com.teamtaskpro.application.service;

import com.teamtaskpro.domain.entity.Team;
import com.teamtaskpro.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Team createTeam(Team team);

    Optional<Team> getTeamById(Long id);

    Optional<Team> getTeamByName(String name);

    List<Team> getAllTeams();

    Team updateTeam(Team team);

    void deleteTeam(Long id);

    Team addMemberToTeam(Long teamId, Long userId);

    Team removeMemberFromTeam(Long teamId, Long userId);

    List<User> getTeamMembers(Long teamId);
}