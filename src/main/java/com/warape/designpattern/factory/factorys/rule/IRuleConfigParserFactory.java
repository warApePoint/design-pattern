package com.warape.designpattern.factory.factorys.rule;

import com.warape.designpattern.factory.parsers.rule.IRuleConfigParser;

public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
