package kim.nzxy.spel.demo.demo;

import kim.nzxy.spel.demo.anno.Aop;
import kim.nzxy.spel.demo.anno.AopParent;
import org.springframework.cache.annotation.CacheEvict;

/**
 * @author ly-chn
 */
public class Demo {
    @Aop("#root.integer")
    @CacheEvict(key = "getMethodName()")
    public void demo(String name) {

    }
}
