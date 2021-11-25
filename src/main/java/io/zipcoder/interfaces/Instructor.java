package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner leaner, double numberOfHours) {
    return learner * numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }


//        Instructor should have a concrete implementation of the teach method which invokes the learn method on the specified Learner object.
//        Instructor should have a concrete implementation of the lecture method which invokes the learn method on each of the elements
//        in the specified array of Learner objects.
//        numberOfHours should be evenly split amongst the learners.
//        double numberOfHoursPerLearner = numberOfHours / learners.length;


}
