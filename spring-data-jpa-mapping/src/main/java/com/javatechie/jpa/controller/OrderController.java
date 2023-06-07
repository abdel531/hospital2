package com.javatechie.jpa.controller;

//import com.javatechie.jpa.dto.Consultation;
import com.javatechie.jpa.dto.OrderRequest;
import com.javatechie.jpa.dto.OrderResponse;
import com.javatechie.jpa.entity.Customer;
//import com.javatechie.jpa.entity.Patient;
import com.javatechie.jpa.repository.CustomerRepository;
import com.javatechie.jpa.repository.DoctorRepository;
//import com.javatechie.jpa.repository.PatientRepository;
import com.javatechie.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    // @Autowired
    // private PatientRepository patientRepository;
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }
    
    // @PostMapping("/consultation")
    // public Patient placeConsult(@RequestBody Consultation request1){
    //    return patientRepository.save(request1.getPatient());
    // }
    

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
