package ru.nsu.fit.SerebrovMaksim.lab2;

import java.util.List;

public class ParsedCommand {
    String commandText;
    List<String> arguments;

    public ParsedCommand(String commandText, List<String> arguments) {
        this.commandText = commandText;
        this.arguments = arguments;
    }
}
