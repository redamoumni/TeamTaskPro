package com.teamtaskpro;

import org.junit.jupiter.api.Test;

import com.teamtaskpro.domain.entity.Team;
import com.teamtaskpro.domain.entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserCreation() {
        User user = new User();
        user.setUsername("johndoe");
        user.setEmail("john@example.com");
        user.setPassword("password");

        assertEquals("johndoe", user.getUsername());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("password", user.getPassword());
    }

    @Test
    void testAddTeam() {
        User user = new User();
        Team team = new Team();
        team.setName("Development");

        user.getTeams().add(team);

        assertTrue(user.getTeams().contains(team));
        assertEquals(1, user.getTeams().size());
    }
}