package vttp.csf.contactform.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vttp.csf.contactform.model.Contact;

@Controller
@RequestMapping(path="/api")
public class ContactformController {
    
    @PostMapping(value="/save", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody // Returning a response and not a view
    public ResponseEntity<String> saveContact(@RequestBody MultiValueMap<String,String> form) {
        String name = form.getFirst("name");
        String telephone = form.getFirst("telephone");
        String email = form.getFirst("email");

        Contact contact = new Contact(name, telephone, email);
        
        return ResponseEntity.ok(contact.toJson().toString());
    }

}
