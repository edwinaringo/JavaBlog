package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void NewPostObjectGetsCorrectlyCreated_true()throws Exception {
        Post post = new Post("Day 1: Intro");
        assertEquals(true,post instanceof Post);

    }

    @AfterEach
    void tearDown() {
    }
}