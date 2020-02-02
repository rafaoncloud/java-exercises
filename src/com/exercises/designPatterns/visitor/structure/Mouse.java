package com.exercises.designPatterns.visitor.structure;

import com.exercises.designPatterns.visitor.behavior.ComputerPartVisitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
