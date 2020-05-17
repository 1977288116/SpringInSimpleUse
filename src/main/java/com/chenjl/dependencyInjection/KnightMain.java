package com.chenjl.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/root-context.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
