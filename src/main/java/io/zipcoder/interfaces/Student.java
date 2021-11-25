package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    Double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }


    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
        }

    }




//        Part 10.2 - Modify People subclasses
//        Modify the Students class signature to ensure that it is a subclass of People of parameterized type Student.
//        Modify the Instructors class signature to ensure that it is a subclass of People of parameterized type Instructor.
//        Provide concrete implementations of the getArray method in each of these classes.