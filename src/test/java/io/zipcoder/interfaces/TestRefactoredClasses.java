package io.zipcoder.interfaces;

public class TestRefactoredClasses {
}


//        Part 10.0 - Test refactored classes.
//        Ensure that the TestStudents, TestInstructors, TestPeople, TestZipCodeWilmington classes were not affected by the refactor.
//        Notice the Design Flaw - Non-Intuitive Orientation
//        You may have noticed that findById makes it difficult to intuitively identify which Person object is being returned. To remedy this issue, we can make use of an enum which manipulates a composite instructor object.