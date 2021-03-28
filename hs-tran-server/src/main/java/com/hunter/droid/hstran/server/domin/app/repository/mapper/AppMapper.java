package com.hunter.droid.hstran.server.domin.app.repository.mapper;

import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppPO record);

    int insertSelective(AppPO record);

    AppPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppPO record);

    int updateByPrimaryKey(AppPO record);

    @Select("SELECT * FROM app"
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
    List<AppPO> getList(@Param("pageNum")int pageNum
            , @Param("pageSize") int pageSize, @Param("keyWord") String keyWord);
}