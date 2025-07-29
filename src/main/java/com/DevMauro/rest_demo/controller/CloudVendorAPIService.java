package com.DevMauro.rest_demo.controller;
import com.DevMauro.rest_demo.model.CloudVendor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
  CloudVendor cloudVendor;
  @GetMapping("{vendorID}")

  public CloudVendor getCLoudVendorDetails(String vendorId) {
    return cloudVendor;
    //("c1", "vendor 1",
    //   " Address one", "xxxxxxxxx");
  }

  @PostMapping
 public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
  {this.cloudVendor = cloudVendor;
    return  "CLoud vendor created successfully!";
  }
  @PutMapping
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
  {this.cloudVendor = cloudVendor;
    return  "CLoud vendor updated successfully!";
  }

  @DeleteMapping("{vendorId}")
  public String deleteCloudVendorDetails(String vendorId)
  {this.cloudVendor = null;
    return  "CLoud vendor Deleted successfully!";
  }

}

