package com.psl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.model.Lft_Report;

public interface ReportRepository extends JpaRepository<Lft_Report, Long> {

}
