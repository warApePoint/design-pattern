package com.warape.designpattern.factory;

import com.warape.designpattern.factory.factorys.rule.*;
import lombok.NonNull;

/**
 * @author wan
 */

public enum RuleConfigParserFactoryEnum {


    /**
     *
     */
    JSON("json", new JsonRuleConfigParserFactory()),
    XML("xml", new XmlRuleConfigParserFactory()),
    YAML("yaml", new YamlRuleConfigParserFactory()),
    PROPERTIES("properties", new PropertiesRuleConfigParserFactory());

    RuleConfigParserFactoryEnum(String key, IRuleConfigParserFactory ruleConfigParserFactory) {
        this.key = key;
        this.ruleConfigParserFactory = ruleConfigParserFactory;
    }

    private final String key;
    private final IRuleConfigParserFactory ruleConfigParserFactory;

    public String getKey() {
        return key;
    }

    /**
     * 获取工厂
     * @param type
     * @return
     */
    public static IRuleConfigParserFactory getParserFactory(@NonNull String type) {

        for (RuleConfigParserFactoryEnum ruleConfigParserFactoryEnum : RuleConfigParserFactoryEnum.values()) {
            if(ruleConfigParserFactoryEnum.key.equals(type)){
                return ruleConfigParserFactoryEnum.ruleConfigParserFactory;
            }
        }
        return null;
    }
}