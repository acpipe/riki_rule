package com.riki.rule.core.rule;

import java.util.ArrayList;
import java.util.List;

import com.rike.rule.core.api.Action;
import com.rike.rule.core.api.Condition;

/**
 * @author huming on 2023/1/12.
 */
public class RuleBuilder<T extends Action<T>> {
    private String name = "rule";

    private String desc = "ruleDesc";

    private Condition condition = Condition.FALSE_CONDITION;

    private List<Action<T>> actions = new ArrayList<>();

    public RuleBuilder<T> name(String name) {
        this.name = name;
        return this;
    }

    public RuleBuilder<T> when(Condition condition) {
        this.condition = condition;
        return this;
    }
}
