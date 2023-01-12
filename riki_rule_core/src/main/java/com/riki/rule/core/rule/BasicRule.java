package com.riki.rule.core.rule;

import java.util.ArrayList;
import java.util.List;

import com.rike.rule.core.api.Action;
import com.rike.rule.core.api.Condition;
import com.rike.rule.core.api.Facts;
import com.rike.rule.core.api.Rule;

/**
 * @author huming on 2023/1/11.
 */
public class BasicRule<T> implements Rule {
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
