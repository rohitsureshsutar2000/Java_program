package com.demo.dao;

import com.demo.beans.Rider;

public interface Logindao {

	Rider validUser(String uname, String pass);

}
