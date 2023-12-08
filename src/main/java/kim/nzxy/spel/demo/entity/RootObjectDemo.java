package kim.nzxy.spel.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;


@AllArgsConstructor
@Getter
public class RootObjectDemo {
    private final Integer integer;
    private final List<String> strList;
    private final Map<String, Object> strObjeMap;

}
