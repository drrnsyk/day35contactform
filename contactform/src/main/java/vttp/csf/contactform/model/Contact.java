package vttp.csf.contactform.model;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Contact {
    String name;
    String telephone;
    String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact (String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
            .add("name", name)
            .add("telephone", telephone)
            .add("email", email)
            .build();
    }

    
}
