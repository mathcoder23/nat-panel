package com.pettyfox.nat.gateway.infrastucture.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Copyright: Copyright (c) 2022</p>
 * <p>Description: Created by Petty Fox on 2022/1/14</p>
 * <p></p>
 *
 * @author Petty Fox
 */
@Configuration
@MapperScan({
        "com.pettyfox.game.gameservice.basic.business.domain.repository"
})
@Slf4j
public class MybatisConfiguration {

}
