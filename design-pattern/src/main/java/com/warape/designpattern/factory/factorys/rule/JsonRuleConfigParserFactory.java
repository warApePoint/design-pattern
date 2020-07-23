package com.warape.designpattern.factory.factorys.rule;

import com.warape.designpattern.factory.parsers.rule.IRuleConfigParser;
import com.warape.designpattern.factory.parsers.rule.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
