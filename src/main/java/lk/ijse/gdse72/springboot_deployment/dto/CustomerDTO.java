package lk.ijse.gdse72.springboot_deployment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private int  cid;
    private String c_address;
    private String  c_name;

}
