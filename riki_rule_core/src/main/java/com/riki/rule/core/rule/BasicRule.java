package com.riki.rule.core.rule;

import com.rike.rule.core.fact.Facts;

/**
 * @author huming on 2023/1/11.
 */
public class BasicRule implements Rule {
    protected String name;
    protected String desc;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public boolean evaluate(Facts facts) {
        return false;
    }

    @Override
    public void execute(Facts f) {

    }

    @Override
    public int compareTo(Rule o) {
        return 0;
    }
}
