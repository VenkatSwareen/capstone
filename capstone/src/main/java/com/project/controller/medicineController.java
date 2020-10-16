package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Medicine;
import com.project.service.MedicineService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class medicineController {

	@Autowired
	private MedicineService service;

	@PostMapping("/medicine")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
	return service.addMedicine(medicine);
    }
    @PutMapping("/medicine")
    public Medicine updateMedicine(@RequestBody Medicine medicine) {
	return service.updateMedicine(medicine);
    }
    @GetMapping("/medicine/{id}")
    public Medicine getMedicineById(@PathVariable int id) {
	return service.getMedicineById(id);
    }

    @DeleteMapping("/medicine/{id}")
    public void deleteMedicineById(@PathVariable int id) {
	service.deleteMedicineById(id);
    }
    @GetMapping("/medicines")
    public List<Medicine> getAllMedicines() {
	return service.getAllMedicines();
    }
}
