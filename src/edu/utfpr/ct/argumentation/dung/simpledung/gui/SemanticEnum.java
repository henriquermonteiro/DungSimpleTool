/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.ct.argumentation.dung.simpledung.gui;

import org.tweetyproject.arg.dung.reasoner.AbstractExtensionReasoner;
import org.tweetyproject.arg.dung.reasoner.SimpleAdmissibleReasoner;
import org.tweetyproject.arg.dung.reasoner.SimpleCompleteReasoner;
import org.tweetyproject.arg.dung.reasoner.SimpleConflictFreeReasoner;
import org.tweetyproject.arg.dung.reasoner.SimplePreferredReasoner;

/**
 *
 * @author henri
 */
public enum SemanticEnum {
    ConflicFree("Livre de Conflitos", new SimpleConflictFreeReasoner()), Admissible("Adminissível", new SimpleAdmissibleReasoner()),
    Complete("Completa", new SimpleCompleteReasoner()), Preferred("Preferida", new SimplePreferredReasoner()), 
    Grounded("Grounded", new SimpleAdmissibleReasoner());
    
    public final String name;
    public final AbstractExtensionReasoner reasoner;

    private SemanticEnum(String name, AbstractExtensionReasoner reasoner) {
        this.name = name;
        this.reasoner = reasoner;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
