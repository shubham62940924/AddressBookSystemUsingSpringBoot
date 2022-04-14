package com.blz.addressbook.controller.controller;


import com.blz.addressbook.entity.Contact;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/addressbookservice")
    public class AddressBookController {
    /**
     *Simple http request get, put ,update,delete,post
     * @return
     */
        @RequestMapping(value = {"", "/", "/get"})
        public String welcomeUser() {
            return "Welcome to address book home";
        }

    /**
     *
     * @param id
     * @return
     */
        @GetMapping("/get/{id}")
        public String welcomeSpecificUser(@PathVariable String id) {
            return "Welcome, User " + id;
        }

    /**
     *
     * @param contact
     * @return
     */
        @PostMapping("/post")
        public String createContact(@RequestBody Contact contact) {
            return "Added " + contact.getName() + " to list";
        }

    /**
     *
     * @param contact
     * @return
     */
        @PutMapping("/update")
        public String updateContact(@RequestBody Contact contact) {
            return "Updated " + contact.getName() + " in list";
        }

    /**
     *
     * @param id
     * @return
     */
        @DeleteMapping("/delete/{id}")
        public String deleteContact(@PathVariable String id) {
            return "Deleted contact " + id;
        }
    }

