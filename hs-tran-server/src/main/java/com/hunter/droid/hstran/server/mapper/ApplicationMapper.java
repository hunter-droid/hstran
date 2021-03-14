package com.hunter.droid.hstran.server.mapper;

import com.hunter.droid.hstran.server.model.Application;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

    @Select("SELECT * FROM application"
            +" where app_id like concat('%',#{keyWord},'%') or app_name like concat('%',#{keyWord},'%')"
            +" order by gmt_create desc")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "appId", column = "app_id"),
            @Result(property = "appName", column = "app_name"),
            @Result(property = "description", column = "description"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify")
    })
    List<Application> getList(@Param("pageNum")int pageNum
            ,@Param("pageSize") int pageSize,@Param("keyWord") String keyWord);
}