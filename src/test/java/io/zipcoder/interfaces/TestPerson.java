package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

    public void testDefaultContructorTest() {
    // Given
        String expectedName = "";
        Long expectedId = null;

    // When
        Person person = new Person();

    // Then
        String actualName = person.getName();
        Long actualId = person.getId();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testSetName() {
    // Given
        Person person = new Person();
        String expectedName = "Carnell";

    // When
        person.setName(expectedName);
        String actualName = person.getName();

    // Then
        Assert.assertEquals(expectedName, actualName);
    }

}
