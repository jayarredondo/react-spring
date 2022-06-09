package com.crm.crm.models;

import org.springframework.data.repository.CrudRepository;;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    
}
