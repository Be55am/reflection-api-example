package tech.bessam;

import org.w3c.dom.ls.LSOutput;
import tech.bessam.model.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author bessam on 28/12/2020
 */

public class PlayWithReflection {

    public static void main(String[] args) throws ClassNotFoundException {

        String personClassName = "tech.bessam.model.Person";
        Class<?> personClass = Class.forName(personClassName);

        System.out.println("# Person Class" + personClass.toString());

        Field[] fields = personClass.getFields();
        System.out.println("# fields : " + Arrays.toString(fields));
        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println("# Declared fields : " + Arrays.toString(declaredFields));

        Method[] methods = personClass.getMethods();
        System.out.println("######## Methods: " );
        Arrays.stream(methods).forEach(System.out::println);
        Method[] declaredMethods = personClass.getDeclaredMethods();
        System.out.println("######### Declared Methods : ");
        Arrays.stream(declaredMethods).forEach(System.out::println);

        System.out.println("######## Static Declared Methods :");
        Arrays.stream(declaredMethods).filter(method -> Modifier.isStatic(method.getModifiers())).forEach(System.out::println);

    }
}
