package sg.edu.nus.iss.day22workshop.Model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//first thing to create
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RSVP {
    
    private int id;
    private String name;
    private String email;
    private Integer phone;
    private Date confirmationDate;
    private String comments;
}
