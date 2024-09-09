package com.scm.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserForm {

    @NotBlank(message = "This field is required")
    @Size(min=3, message = "Minimum 3 characters are required")
    private String name;

    
    @NotBlank(message = "This field is required")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "This field is required")
    @Size(min = 6, message = "Minimum 6 characters are required")
    private String password;

    private String about;

    
    @NotBlank(message = "This field is required")
    @Size(min = 10, max = 10, message = "Invalid phone number")
    private String phoneNumber;
}
