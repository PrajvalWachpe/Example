package accessSpecifierDemo;

import java.util.*;
public class Test implements Runnable {

public void run() {

System.out.print("test");

}

public static void main(String[] args) {

Thread t = new Thread(new Test());

t.start();

t.run();

}

}