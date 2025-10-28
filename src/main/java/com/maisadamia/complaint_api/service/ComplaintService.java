package com.maisadamia.complaint_api.service;

import com.maisadamia.complaint_api.model.Complaint;
import com.maisadamia.complaint_api.repository.ComplaintRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComplaintService {
    private final ComplaintRepository repository;

    public ComplaintService(ComplaintRepository repository) {
        this.repository = repository;
    }

    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }    

    public Complaint createComplaint(Complaint complaint) {
        return repository.save(complaint);
    }

    public Complaint updateStatus(Long id, String status) {
        Complaint c = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Complaint not found with id " + id));
        c.setStatus(status);
        return repository.save(c);
    }
}