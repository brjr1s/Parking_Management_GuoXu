package com.smart.module.sys.repository;

import com.smart.module.sys.entity.SysConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * sys_user Repository
 * Created by 2023
 * Sun Oct 27 13:03:00 CST 2023
*/ 
@Repository 
public interface SysConfigRepository extends JpaRepository<SysConfig, Long> {

}

