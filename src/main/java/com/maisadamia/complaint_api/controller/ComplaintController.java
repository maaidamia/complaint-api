package com.maisadamia.complaint_api.controller;

import com.maisadamia.complaint_api.model.Complaint;
import com.maisadamia.complaint_api.service.ComplaintService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin
public class ComplaintController {
    private final ComplaintService service;

    public ComplaintController(ComplaintService service) {
        this.service = service;
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return service.getAllComplaints();
    }

    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        return service.createComplaint(complaint);
    }

    @PutMapping("/{id}/{status}")
    public Complaint updateComplaintStatus(@PathVariable Long id, @PathVariable String status) {
        return service.updateStatus(id, status);
    }

    @GetMapping("/test")
    public String testApp() {
        return "Complaint API is running!";
    }
}
