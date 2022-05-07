package com.example.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * This class will contain all the terminal classes that are being used by the application
 */
public class TerminalTypeRegister {

    private Map<String, Class> terminalMap = new HashMap <String, Class>();

    public void registerClass (String terminalType, Class terminalClass) {
        terminalMap.put (terminalType, terminalClass);
    }
    
}
