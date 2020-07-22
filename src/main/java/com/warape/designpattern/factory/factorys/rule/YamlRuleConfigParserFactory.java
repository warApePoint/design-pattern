package com.warape.designpattern.factory.factorys.rule;

import com.warape.designpattern.factory.parsers.rule.IRuleConfigParser;
import com.warape.designpattern.factory.parsers.rule.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
