package ru.javabegin.training.springlibrary.interfaces;

import ru.javabegin.training.springlibrary.objects.Instruction;
import ru.javabegin.training.springlibrary.objects.Section;
import ru.javabegin.training.springlibrary.objects.User;

import java.util.List;

public interface InstructionSearch {
    List<Instruction> getInstructions();
    List<Instruction> getInstructions(User author);
    List<Instruction> getInstructions(String instructionName);
    List<Instruction> getInstructions(Section section);
    List<Instruction> getInstructions(Character letter);
}
