package cn.caa.cms.mapper;

import cn.caa.cms.domain.UserCar;

public interface UserCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCar record);

    int insertSelective(UserCar record);

    UserCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCar record);

    int updateByPrimaryKey(UserCar record);
}