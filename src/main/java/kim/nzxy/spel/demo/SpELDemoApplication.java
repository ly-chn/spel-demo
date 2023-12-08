package kim.nzxy.spel.demo;

import kim.nzxy.spel.demo.entity.RootObjectDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ly-chn
 */
@SpringBootApplication
public class SpELDemoApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext ctx = new StandardEvaluationContext();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ly");
        map.put("age", 18);
        map.put("sex", '男');
        ctx.setRootObject(new RootObjectDemo(1, Arrays.asList("1", "3", "5"), map));
        Expression exp = parser.parseExpression("integer");
        ctx.registerFunction("cs", SpELDemoApplication.class.getDeclaredMethod("changeStr", String.class));
        Object value = exp.getValue(ctx, Object.class);
        System.out.println(value);
    }

    public static String changeStr(String s) {
        return "$$" + s + "$$";
    }

}
