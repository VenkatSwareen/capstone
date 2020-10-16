package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.repository.MedicineRepository;
import com.project.model.Medicine;
import com.project.service.MedicineService;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineService {
	
	@Autowired
	private MedicineRepository dao;

	@Override
	public Medicine addMedicine(Medicine medicine) {
		return dao.save(medicine);
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		return dao.save(medicine);
	}

	@Override
	public Medicine getMedicineById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteMedicineById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Medicine> getAllMedicines() {
		return dao.findAll();
	}

}
