package com.SPM.sai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {


        private String First_Name;
        private String Last_Name;
        private String Email;
        private String Mobile_Number;
        private String Password;


}
