package homework9;


import java.util.HashMap;
import java.util.Objects;

public class TestClass {
    public static void main(String[] args) {
        /* Tests and debug */



        MyHashMap<String, Integer> testMap = new MyHashMap<>();
        testMap.put("Sara", 143434);
        System.out.println("Map size = " + testMap.size());
        testMap.put("Diana", 1515151);
        System.out.println("Map size = " + testMap.size());
        testMap.put("Anna", 552413);
        System.out.println("Map size = " + testMap.size());
        testMap.put("Elizabet", 666666);
        System.out.println("Map size = " + testMap.size());
        testMap.put("Vera", 88888);
        System.out.println("Map size = " + testMap.size());
        testMap.put("Sveta", 77777);
        System.out.println("Map size = " + testMap.size());

        System.out.println(testMap.size());


        testMap.put("Anna", 120410);
        System.out.println(testMap.size());

        System.out.println("Sveta " + testMap.get("Sveta"));
        System.out.println(testMap.size());
        testMap.put("Lera", 111111);
        System.out.println(testMap.get("Lera"));
        System.out.println("Diana " + testMap.get("Diana"));
        System.out.println("Sara " + testMap.get("Sara"));
        System.out.println("Anna " + testMap.get("Anna"));
        System.out.println("Elizabet " + testMap.get("Elizabet"));
//        System.out.println(testMap.get("Karina"));

        testMap.remove("Elizabet");
        System.out.println(testMap.get("Anna"));
//        testMap.remove("Anna");
        System.out.println(testMap.get("Vera"));
        System.out.println("Diana " + testMap.get("Diana"));
        System.out.println("Sara " + testMap.get("Sara"));
        System.out.println("Anna " + testMap.get("Anna"));
        System.out.println("Elizabet " + testMap.get("Elizabet"));


//        System.out.println(testMap.get("Sara"));
//        System.out.println(testMap.get("Diana"));
//        System.out.println(testMap.get("Anna"));
//        System.out.println(testMap.get("Elizabet"));
//        System.out.println(testMap.get("Vera"));
//        System.out.println(testMap.get("Sveta"));










    }
}
