package com.example.factory;

public class TerminalSimpleFactory {
    
    public Terminal createTerminal (String terminalType) {
        Terminal terminal = null;
        if (terminalType.equalsIgnoreCase(TerminalEnums.Newtec.toString())) {
            terminal = new NewtecTerminal();
        }
        if (terminalType.equalsIgnoreCase(TerminalEnums.iDirect.toString())) {
            terminal = new IDirectTerminal();
        }
        if (terminalType.equalsIgnoreCase(TerminalEnums.CCOM.toString())) {
            terminal = null;
        }
        return terminal;
    }
}
