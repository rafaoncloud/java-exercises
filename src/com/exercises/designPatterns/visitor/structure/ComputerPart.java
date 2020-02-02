package com.exercises.designPatterns.visitor.structure;

import com.exercises.designPatterns.visitor.behavior.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
