package com.exercises.designPatterns.visitor.behavior;

import com.exercises.designPatterns.visitor.structure.Computer;
import com.exercises.designPatterns.visitor.structure.Keyboard;
import com.exercises.designPatterns.visitor.structure.Monitor;
import com.exercises.designPatterns.visitor.structure.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
