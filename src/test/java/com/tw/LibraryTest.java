package com.tw;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }

    @Test
    public void testAddStudent() {
        Library library = mock(Library.class);
        library.addStudent();
        verify(library,times(1)).addStudent();
    }

    @Test
    public void testPrintInfo() {
        Library library = mock(Library.class);
        library.printInfo();
        verify(library,times(1)).printInfo();


    }

}
