package com.warape.designpattern.factory.parsers;

import com.warape.designpattern.factory.RuleConfig;

public interface ISystemConfigParser {

    RuleConfig parse(String configText);
}
