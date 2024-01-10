package com.demo.model;

public class RiderStatus {

		
		private int rider_id;	
		private int status_id;
		private String bike;
		private String expense;
		public RiderStatus() {
			super();
		}
		public RiderStatus( int status_id, String bike, String expense) {
			super();
			
			this.status_id = status_id;
			this.bike = bike;
			this.expense = expense;
		}
		public int getRider_id() {
			return rider_id;
		}
		public void setRider_id(int route_id) {
			this.rider_id = route_id;
		}
		public int getStatus_id() {
			return status_id;
		}
		public void setStatus_id(int status_id) {
			this.status_id = status_id;
		}
		public String getBike() {
			return bike;
		}
		public void setBike(String bike) {
			this.bike = bike;
		}
		public String getExpense() {
			return expense;
		}
		public void setExpense(String expense) {
			this.expense = expense;
		}
		@Override
		public String toString() {
			return "RiderStatus [rider_id=" + rider_id + ", status_id=" + status_id + ", bike=" + bike + ", expense="
					+ expense + "]";
		}
		
	}
