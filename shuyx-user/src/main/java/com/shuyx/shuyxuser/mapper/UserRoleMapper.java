package com.shuyx.shuyxuser.mapper;

import com.shuyx.shuyxuser.dto.UserRoleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper {
    public Integer batchInsertUserRole(List<UserRoleDTO> dto);
    public Integer batchDeleteUserRole(List<UserRoleDTO> dto);
    public List<UserRoleDTO> findRoleByUserId(Integer userId);
}
