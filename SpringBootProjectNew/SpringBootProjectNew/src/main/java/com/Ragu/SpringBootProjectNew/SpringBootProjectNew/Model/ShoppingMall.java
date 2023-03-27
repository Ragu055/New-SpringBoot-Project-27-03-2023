package com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShoppingMall {
	
	       @Id
	       @GeneratedValue(strategy=GenerationType.IDENTITY)      
	       @Column(name="Shop_No")
          private int shopNo;
	       public int getShopNo() {
			return shopNo;
		}
		public void setShopNo(int shopNo) {
			this.shopNo = shopNo;
		}
		public String getShopName() {
			return ShopName;
		}
		
		
		public ShoppingMall() {
			super();
		}
		public ShoppingMall(int shopNo, String shopName, String shopLocation, String shopemail) {
			super();
			this.shopNo = shopNo;
			ShopName = shopName;
			ShopLocation = shopLocation;
			Shopemail = shopemail;
		}
		public void setShopName(String shopName) {
			ShopName = shopName;
		}
		public String getShopLocation() {
			return ShopLocation;
		}
		public void setShopLocation(String shopLocation) {
			ShopLocation = shopLocation;
		}
		public String getShopemail() {
			return Shopemail;
		}
		public void setShopemail(String shopemail) {
			Shopemail = shopemail;
		}
		@Column(name="Shop_Name")
          private String ShopName;
		
		
	       @Column(name="Shop_Location")
          private String ShopLocation;
	       
	       @Column(name="Shop_Email")
          private String Shopemail;
}
