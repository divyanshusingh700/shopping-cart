package com.truecodes.order_service.repository;

import com.truecodes.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends JpaRepository<Order, Long > {
}
