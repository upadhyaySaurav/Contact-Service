package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 1311L),
            new Contact(2L, "anil@gmail.com", "Anil", 1311L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
    );
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return this.list.stream().filter(user -> user.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
