package com.smart.module.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import com.smart.module.sys.entity.SysMenu;

/**
 * sys_menu Repository
 * Created by 2023
 * Sun Oct 27 13:02:31 CST 2023
*/ 
@Repository 
public interface SysMenuRepository extends JpaRepository<SysMenu, Long> {
}

