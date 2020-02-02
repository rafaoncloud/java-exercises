package com.exercises.designPatterns.visitor.behavior;

import com.exercises.designPatterns.visitor.structure.Computer;
import com.exercises.designPatterns.visitor.structure.Keyboard;
import com.exercises.designPatterns.visitor.structure.Monitor;
import com.exercises.designPatterns.visitor.structure.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
