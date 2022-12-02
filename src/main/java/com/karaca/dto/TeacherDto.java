package com.karaca.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {
    private Long teacherId;

    @NotEmpty(message = "ad soyad alanı boş geçemez")
    @Size(min=1, max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "email")
    @Email(message = "uygun formatta mail girilmedi")
    private String teacherEmail;

    @NotEmpty(message = "şifreyi boş geçilemez")
    //@Min(value=18, message="minumum 18 karakter olmalısınız")
    //@Max(value=50, message="maximum 50 karakter olmalısınız")
    @Size(min=6, max = 10)
    private String teacherPassword;

}
