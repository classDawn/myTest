package dawn.cloud.provider3.service;

import dawn.cloud.api.entity.Dept;

import java.util.List;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
