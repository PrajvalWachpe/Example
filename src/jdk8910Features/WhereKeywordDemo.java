package jdk8910Features;
/*
 * VAR keyword is used to create local variable. we can store any type 
 * of data in it.
 * 
 * Rules:-
 * 
 * 1] we can't make instance variables using VAR keyword.
 * 2] we can use it only within a local scope. 
 * 3] we can't use VAR to declare return type or parameter of a method.
 * 4] If we want to change the value of the VAR variable then we should change with same tape 
 * 5] VAriables with type VAR have to be initialized while creating.
 * 6] VAR data-types can be used for making reference variables of any class object also. 
 * 
 */
public class WhereKeywordDemo {

	public static void main(String[] args) {
		
		var num=15;
		var name="Prajval";
		var marks=89.99;
		var fresher="True";

	}

}
