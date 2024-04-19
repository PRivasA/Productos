package com.example.ProductoApi.repository;

import com.example.ProductoApi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
