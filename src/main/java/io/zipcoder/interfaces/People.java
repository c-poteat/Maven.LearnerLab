package io.zipcoder.interfaces;

public class People {
}



//        Part 6.1 - Create People class
//Create a People class.
//        The class should instantiate a List field of Person objects named personList.
//        The class should define a method named add which adds a Person to the personList.
//        The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
//        The class should define a named contains which makes use of a Person person parameter to return true if the personList contains the respective Person object.
//        The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
//        The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
//        The class should define a named removeAll which clears our personList field.
//        The class should define a method named count which returns the size of personList.
//        The class should define a method named toArray which returns an array representation of the personList field.
//        The class should implement Iterable<E> and define a method named iterator which makes use of the personList field to generate a new a Iterator<E>.




//        Part 10.1 - Modify People class
//Parameterize the People signature to enforce that it is a container for objects of type E such that E is a subclass of Person.
//        Modify the class signature to declare this class abstract.
//        An abstract class cannot be instantiated; Its concrete implementation is deferred to its subclass.
//        Modify people field to enforce that is a container of objects of type E.
//        Modify the add method to ensure that it handles object of type E.
//        Modify the findById method to ensure that it returns an object of type E.
//        Modify the getArray method signature by declaring it abstract of return tyoe E.
//        An abstract method is a subclass's contractual agreement to the deferment of an implementation of a respective method.