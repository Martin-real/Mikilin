package com.simon.mikilin.core.value;

import com.simon.mikilin.core.annotation.Check;
import com.simon.mikilin.core.annotation.FieldValidCheck;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2019/1/5 下午7:05
 */
@Data
@Accessors(chain = true)
public class
CEntity {

    @FieldValidCheck({"a", "b"})
    private String name;
    @Check
    private List<BEntity> bEntities;
}
