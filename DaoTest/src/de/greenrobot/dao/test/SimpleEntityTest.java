package de.greenrobot.dao.test;

import de.greenrobot.orm.test.AbstractDaoTestLongPk;
import de.greenrobot.testdao.SimpleEntityNotNull;
import de.greenrobot.testdao.SimpleEntityNotNullDao;

public class SimpleEntityTest extends AbstractDaoTestLongPk<SimpleEntityNotNullDao, SimpleEntityNotNull> {

    public SimpleEntityTest() {
        super(SimpleEntityNotNullDao.class);
    }

    @Override
    protected SimpleEntityNotNull createEntity(Long key) {
        SimpleEntityNotNull entity = new SimpleEntityNotNull();
        entity.setId(key);
        entity.setSimpleBoolean(true);
        entity.setSimpleByte(Byte.MAX_VALUE);
        entity.setSimpleShort(Short.MAX_VALUE);
        entity.setSimpleInt(Integer.MAX_VALUE);
        entity.setSimpleLong(Long.MAX_VALUE);
        entity.setSimpleFloat(Float.MAX_VALUE);
        entity.setSimpleDouble(Double.MAX_VALUE);
        entity.setSimpleString("greenrobot greenDAO");
        byte[] bytes = { 42, -17, 23, 0, 127, -128 };
        entity.setSimpleByteArray(bytes);
        return entity;
    }

}