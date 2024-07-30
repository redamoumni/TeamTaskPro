package com.teamtaskpro;

import org.junit.jupiter.api.Test;

import com.teamtaskpro.domain.entity.Team;
import com.teamtaskpro.domain.entity.User;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testTeamCreation() {
        Team team = new Team("Development");
        assertEquals("Development", team.getName());
    }

    @Test
    void testAddUser() {
        Team team = new Team("Marketing");
        User user = new User("janedoe", "password", "jane@example.com");

        team.addMember(user);

        assertTrue(team.getMembers().contains(user));
        assertTrue(user.getTeams().contains(team));
    }

    @Test
    void testRemoveUser() {
        Team team = new Team("Sales");
        User user = new User("bobsmith", "password", "bob@example.com");

        team.addMember(user);
        team.removeMember(user);

        assertFalse(team.getMembers().contains(user));
        assertFalse(user.getTeams().contains(team));
    }
}