package com.company.Utility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Retention тип хранения
// RUNTIME т.е. может использоваться во время выполнения самой проги
@Retention(RetentionPolicy.RUNTIME)

//Таргет задает тип объекта над которым может указываться создаваемая аннотация(метод)
@Target(ElementType.METHOD)

public @interface Annotation {
    //имя команды
    String name();
}
