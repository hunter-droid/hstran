package com.hunter.droid.hstran.server.mapper;

import com.hunter.droid.hstran.server.model.Application;
import com.hunter.droid.hstran.server.model.Locale;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/14 4:46 下午
 */
@Service
public interface LocaleMapper {


    @Insert("INSERT INTO locale(name,description) VALUES(#{name}, #{description})")
    int insert(Locale locale);

    @Select("SELECT * FROM locale")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify")
    })
    List<Locale> getList();
}
