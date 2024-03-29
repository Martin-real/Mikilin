package com.simon.mikilin.core.type;

import com.simon.mikilin.core.annotation.FieldType;
import com.simon.mikilin.core.annotation.FieldInvalidCheck;
import com.simon.mikilin.core.annotation.FieldValidCheck;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2019/3/10 下午9:50
 */
@Data
@Accessors(chain = true)
public class FixPhoneEntity {

    @FieldValidCheck(type = FieldType.FIXED_PHONE)
    private String fixedPhone;
    @FieldInvalidCheck(type = FieldType.FIXED_PHONE)
    private String fixedPhoneInValid;
}
