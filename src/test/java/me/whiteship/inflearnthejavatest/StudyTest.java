package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled
    void create1() {
        System.out.println("create1");
    }

    //모든 메소드(테스트)가 실행되기 전에 호출.
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    //모든테스트가 실행된 이후 딱 한번만 호출.
    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    //각각의 test method가 실행될때 호출 , method 실행 전에 호출
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    //각각의 test method가 실행될때 호출, method 실행 후에 호출
    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

}