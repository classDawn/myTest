package dawn.cloud.provider3.service.impl;

import dawn.cloud.api.entity.Dept;
import dawn.cloud.provider3.dao.DeptDao;
import dawn.cloud.provider3.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;


	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}
}
