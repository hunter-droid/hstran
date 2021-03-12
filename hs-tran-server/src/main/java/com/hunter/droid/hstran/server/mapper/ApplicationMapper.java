package com.hunter.droid.hstran.server.mapper;

import com.hunter.droid.hstran.server.model.Application;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

    @Select("SELECT * FROM application")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "appId", column = "app_id"),
            @Result(property = "appName", column = "app_name"),
            @Result(property = "description", column = "description"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify")
    })
    List<Application> getList();
}