package kim.nzxy.spel.demo.anno;

import kim.nzxy.spel.SpELField;
import kim.nzxy.spel.SpELMethod;
import kim.nzxy.spel.SpELRoot;
import kim.nzxy.spel.demo.entity.RootObjectDemo;
import org.intellij.lang.annotations.Language;

/**
 * @author ly-chn
 */
public @interface Aop {

    @SpELMethod(result = true, parameters = true)
    @SpELField(name = "testInt", type = Integer.class)
    @SpELField(name = "testMap", typeStr = "java.util.Map<java.lang.String, java.lang.Object>")
    @SpELField(name = "testList", typeStr = "java.util.List<java.lang.String>")
    @SpELField(name = "testString")
    @SpELRoot(typeStr = "kim.nzxy.spel.demo.entity.RootObjectDemo")
    @Language("SpEL")
    String value();
}
