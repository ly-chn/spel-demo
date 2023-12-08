package kim.nzxy.spel.demo.constant;

import org.intellij.lang.annotations.Language;

public interface DemoConst {
    @Language(value = "JAVA", prefix = "interface A { public static ", suffix = "value;}")
    String strList = "java.util.List<java.lang.String>";
    String spEL = "SpEL";
}
