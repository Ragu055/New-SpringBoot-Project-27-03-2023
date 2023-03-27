package com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Model.ShoppingMall;

@Repository
public interface ShoppingMallRepository extends JpaRepository<ShoppingMall,Long>  {

}
