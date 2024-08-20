package org.scoula.security.mapper;

import org.scoula.security.domain.MemberVO;

public interface UserDetailsMapper {
    public MemberVO get(String username);
}