package com.community.soccer.domain.member.dao;

import java.time.LocalDateTime;

public record MemberEditDao(Long id, String loginId, String nickName, LocalDateTime createDate) { }
