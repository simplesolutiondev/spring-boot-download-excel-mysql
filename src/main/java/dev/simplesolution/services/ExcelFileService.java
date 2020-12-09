package dev.simplesolution.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import dev.simplesolution.entities.Contact;

public interface ExcelFileService {
	
	ByteArrayInputStream export(List<Contact> contacts);
	
}
