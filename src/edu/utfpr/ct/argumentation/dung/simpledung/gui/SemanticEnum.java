/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.ct.argumentation.dung.simpledung.gui;

import org.tweetyproject.arg.dung.reasoner.AbstractExtensionReasoner;

/**
 *
 * @author henri
 */
public enum SemanticEnum {
    ;
    
    public String name;
    public AbstractExtensionReasoner reasoner;

    private SemanticEnum(String name, AbstractExtensionReasoner reasoner) {
        this.name = name;
        this.reasoner = reasoner;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
