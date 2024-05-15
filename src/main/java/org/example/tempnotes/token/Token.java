package org.example.tempnotes.token;

import lombok.Builder;
import lombok.Data;
import org.example.tempnotes.users.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@Document(collection = "tokens")
public class Token {
    @Id
    private String id;
    private String token;
    @Enumerated(EnumType.STRING)
    private TokenType tokenType;
    @Enumerated(EnumType.STRING)
    private TokenPermission tokenPermission;
    private boolean isExpired;
    private boolean isRevoked;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
