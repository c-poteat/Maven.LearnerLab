package io.zipcoder.interfaces;

public enum Educator implements Teacher{


    @Override
    public void teach(Learner leaner, double numberOfHours) {

    }
}


//        The enum should have an enumeration for each of the instructors represented in the Instructors class.
//        Upon construction each enumeration of the enum should instantiate a respective Instructor and assign it to a final instructor field upon construction. The instructor should be added to the Instructors singleton.
//        Calls to the teach and lecture method should be deferred to the composite instructor reference.
//        The enum should have a double timeWorked field which keeps track of the hours that the Educator has taught.



//        Part 11.0 - Test Educator
//        Use Part 5 as a reference.