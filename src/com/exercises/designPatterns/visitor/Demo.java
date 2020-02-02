package com.exercises.designPatterns.visitor;

import com.exercises.designPatterns.visitor.behavior.ComputerPartDisplayVisitor;
import com.exercises.designPatterns.visitor.structure.Computer;
import com.exercises.designPatterns.visitor.structure.ComputerPart;

public class Demo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
