package com.rike.rule.core.api;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author huming on 2023/1/12.
 */
public class Rules implements Iterable<Rule>{
    private Set<Rule> rules = new TreeSet<>();

    @Override
    public Iterator<Rule> iterator() {
        return rules.iterator();
    }
}
