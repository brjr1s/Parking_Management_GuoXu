package com.smart.module.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import com.smart.module.sys.entity.SysRoleMenu;

/**
 * sys_role_menu Repository
 * Created by 2023
 * Sun Oct 27 13:02:47 CST 2023
*/ 
@Repository 
public interface SysRoleMenuRepository extends JpaRepository<SysRoleMenu, Long> {
}

