package com.tata.bankinapp.tests;

import com.tata.bankingapp.models.Customer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class CustomerTest {

    private Customer customer;
    @BeforeEach
    public  void initInstance(){
         customer=new Customer();
         customer.setCustomerId(new Random().nextInt(10000));
    }

    @Test
    public void testCustomerId(){
     assertTrue(customer.getCustomerId()>0);
    }
}
