Spring Boot CRUD Project Documentation
This project is a simple CRUD (Create, Read, Update, Delete) application developed with Spring Boot, following a tutorial from the Think Constructive YouTube channel. It demonstrates basic concepts of building a RESTful API.

📋 Overview
The project consists of an API for managing cloud service providers (Cloud Vendors) with basic CRUD operations.

🛠️ Technologies Used
Java,Spring Boot,IntelliJ IDEA Community (IDE) and Postman (for API testing).

📌 Project Structure
Model: CloudVendor
package com.xxxxx.rest_demo.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    // Constructors, getters and setters
    // ...
}
Controller: CloudVendorAPIService

package com.xxxxx.rest_demo.controller;
import com.xxxxx.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
    }
    
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully!";
    }
    
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully!";
    }
    
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor deleted successfully!";
    }
}
🌐 API Endpoints
Method	Endpoint	Description
GET	/cloudvendor/{vendorId}	Get vendor details
POST	/cloudvendor	Create a new vendor
PUT	/cloudvendor	Update an existing vendor
DELETE	/cloudvendor/{vendorId}	Delete a vendor

🚀 How to Test the API
You can test the API using Postman or any HTTP client:

Create a vendor (POST)
POST http://localhost:8080/cloudvendor
Body (JSON):
{
    "vendorId": "c1",
    "vendorName": "Vendor 1",
    "vendorAddress": "Address One",
    "vendorPhoneNumber": "123456789"
}

Get vendor details (GET)
GET http://localhost:8080/cloudvendor/c1

Update vendor (PUT)
PUT http://localhost:8080/cloudvendor
Body (JSON):
{
    "vendorId": "c1",
    "vendorName": "Vendor Updated",
    "vendorAddress": "New Address",
    "vendorPhoneNumber": "987654321"
}

Delete vendor (DELETE)
DELETE http://localhost:8080/cloudvendor/c1
📝 Notes
This is a basic project for learning purposes
Currently, data is stored only in memory (no database persistence)
The GET endpoint is not using the vendorId from the URL

🔜 Future Improvements
Add database persistence
Implement error handling
Add data validation
Implement automated tests

