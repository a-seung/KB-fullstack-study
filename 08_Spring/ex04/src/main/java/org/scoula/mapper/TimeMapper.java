package org.scoula.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("SELECT sysdate FROM dual") // mybatis에서 제공하는 어노테이션
    public String getTime();

    public String getTime2();

}