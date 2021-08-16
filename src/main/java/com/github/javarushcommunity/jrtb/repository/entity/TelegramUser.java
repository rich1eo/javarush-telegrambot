package com.github.javarushcommunity.jrtb.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * Telegram User entity.
 */
@Data
@Entity
@Table(name = "tg_user")
@EqualsAndHashCode
public class TelegramUser {

    @Id
    @Column(name = "chat_id")
    private String chatId;

    @Column(name = "active")
    private boolean active;
}
