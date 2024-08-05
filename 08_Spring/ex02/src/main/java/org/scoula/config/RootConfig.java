package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.scoula"}) // 이 패키지의 하위패키지를 포함해서 검색함
public class RootConfig {
    // 웹과 무관한 설정(데이터베이스,보안 설정)
    // 데이터 베이스 연동하기 전까진 루트컨피그에 내용 없음
}
