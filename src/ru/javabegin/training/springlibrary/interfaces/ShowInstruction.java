package ru.javabegin.training.springlibrary.interfaces;

import ru.javabegin.training.springlibrary.objects.Instruction;

public interface ShowInstruction {
    void showBook(Instruction instruction);
    void downloadBook(Instruction instruction);
    void voteBook(Instruction instruction);
}
