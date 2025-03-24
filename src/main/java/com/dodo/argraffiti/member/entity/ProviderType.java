package com.dodo.argraffiti.member.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProviderType {
    Kakao("kakao"), Naver("naver"), Google("google"), Basic("basic");

    private final String key;
}
