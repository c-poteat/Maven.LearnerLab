package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
        }

    }

//        Part 3.1 - Create Student Class
//        Create a Student class such that:
//        Student is a subclass of Person
//        Student implements the Learner interface
//Student should have an instance variable totalStudyTime of type double
//        Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
//        Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.



//        Part 10.2 - Modify People subclasses
//        Modify the Students class signature to ensure that it is a subclass of People of parameterized type Student.
//        Modify the Instructors class signature to ensure that it is a subclass of People of parameterized type Instructor.
//        Provide concrete implementations of the getArray method in each of these classes.