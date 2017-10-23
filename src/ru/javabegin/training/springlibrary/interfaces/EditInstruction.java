package ru.javabegin.training.springlibrary.interfaces;

import ru.javabegin.training.springlibrary.objects.Instruction;

public interface EditInstruction {
    boolean save(Instruction instruction);
    boolean delete(Instruction instruction);
    boolean edit(Instruction instruction);
    boolean add(Instruction instruction);
    
}
