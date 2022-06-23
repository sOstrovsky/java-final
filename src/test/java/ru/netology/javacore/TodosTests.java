package ru.netology.javacore;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodosTests {
    Todos sut;

    @BeforeAll
    public static void started() {
        System.out.println("Todos tests started");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Todos tests completed");
    }

    @BeforeEach
    public void initSuite() {
        System.out.println("Todos test started");
        sut = new Todos();
    }

    @AfterEach
    public void finished() {
        System.out.println("Todos test completed");
    }

    @Test
    public void testTasksAdding() {
        // arrange
        sut.addTask("1");
        sut.addTask("2");
        sut.addTask("3");

        int expectedTasksCount = 3;
        // act
        int count = sut.getTodos().size();

        // assert
        assertEquals(expectedTasksCount, count);
    }

    @Test
    public void testTaskRemoval() {
        // arrange
        sut.addTask("1");
        sut.addTask("2");
        sut.addTask("3");
        sut.removeTask("2");

        int expectedTasksCount = 2;

        // act
        int count = sut.getTodos().size();

        // assert
        assertEquals(expectedTasksCount, count);
    }

    @Test
    public void testValidOutput() {
        // arrange
        sut.addTask("Уборка квартиры.");
        sut.addTask("Мытье посуды.");
        sut.addTask("Английский язык.");
        sut.addTask("Пробежка.");
        sut.addTask("Почитать книгу.");
        sut.removeTask("Пробежка.");
        sut.addTask("Бассейн.");

        String expected = "Английский язык. Бассейн. Мытье посуды. Почитать книгу. Уборка квартиры.";
        int expectedTasksCount = 5;

        // act
        String output = sut.getAllTasks();
        int count = sut.getTodos().size();

        // assert
        assertEquals(expected, output);
        assertEquals(expectedTasksCount, count);
    }
}
