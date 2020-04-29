package com.warape.designpattern.factory;

import lombok.NonNull;

public enum RuleConfigParserEnumFactory{


    /**
     *
     */
    JSON("json", new JsonRuleConfigParserFactory()),
    XML("xml", new XmlRuleConfigParserFactory()),
    YAML("yaml", new YamlRuleConfigParserFactory()),
    PROPERTIES("properties", new PropertiesRuleConfigParserFactory());

    RuleConfigParserEnumFactory(String key, IRuleConfigParserFactory ruleConfigParserFactory) {
        this.key = key;
        this.ruleConfigParserFactory = ruleConfigParserFactory;
    }

    private String key;
    private IRuleConfigParserFactory ruleConfigParserFactory;

    public String getKey() {
        return key;
    }

    /**
     * 获取工厂
     * @param type
     * @return
     */
    public static IRuleConfigParserFactory getParserFactory(@NonNull String type) {

        for (RuleConfigParserEnumFactory ruleConfigParserEnumFactory : RuleConfigParserEnumFactory.values()) {
            if(ruleConfigParserEnumFactory.key.equals(type)){
                return ruleConfigParserEnumFactory.ruleConfigParserFactory;
            }
        }
        return null;
    }
}