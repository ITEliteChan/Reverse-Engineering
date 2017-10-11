package com.iot.ssm.mapper;

import com.iot.ssm.po.UserTb;
import com.iot.ssm.po.UserTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTbMapper {
    int countByExample(UserTbExample example);

    int deleteByExample(UserTbExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserTb record);

    int insertSelective(UserTb record);

    List<UserTb> selectByExample(UserTbExample example);

    UserTb selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserTb record, @Param("example") UserTbExample example);

    int updateByExample(@Param("record") UserTb record, @Param("example") UserTbExample example);

    int updateByPrimaryKeySelective(UserTb record);

    int updateByPrimaryKey(UserTb record);
}