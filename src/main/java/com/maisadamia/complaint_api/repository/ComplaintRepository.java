package com.maisadamia.complaint_api.repository;

import com.maisadamia.complaint_api.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}