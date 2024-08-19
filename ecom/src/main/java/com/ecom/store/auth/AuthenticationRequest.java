package com.ecom.store.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {
    @Email(message = "email not formatted")
    @NotEmpty(message = "You need to fill this field")
    @NotNull(message = "You need to fill this field")
    private String email;
    @NotEmpty(message = "You need to fill this field")
    @NotNull(message = "You need to fill this field")
    @Size(min = 8,message = "Password should be 8 characters long minimum")
    private String password;
}
