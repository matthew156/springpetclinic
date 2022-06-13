package com.springlearning.springpetclinic.services;

import com.springlearning.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long > {

    Owner findByLastName(String lastName);
}
