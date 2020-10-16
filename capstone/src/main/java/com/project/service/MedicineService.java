package com.project.service;

import java.util.List;

import com.project.model.Medicine;


public interface MedicineService {

	public Medicine addMedicine(Medicine medicine);
	public Medicine updateMedicine(Medicine medicine);
	public Medicine getMedicineById(int id);
	public void deleteMedicineById(int id);
	public List<Medicine>getAllMedicines();
}
