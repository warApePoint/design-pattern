package com.warape.designpattern.factory.parsers.rule;

import com.warape.designpattern.factory.RuleConfig;

public interface IRuleConfigParser {

    RuleConfig parse(String configText);
}
