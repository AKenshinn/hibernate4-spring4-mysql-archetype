#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.entities.Sample;
import ${package}.repositories.SampleDao;
import ${package}.services.SampleService;

@Transactional
@Service(value = "sampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDao sampleDao;
	
	@Override
	public Serializable insert(Sample entity) {
		return sampleDao.insert(entity);
	}

	@Override
	public void update(Sample entity) {
		sampleDao.update(entity);
	}

	@Override
	public void delete(Sample entity) {
		sampleDao.delete(entity);
	}

	@Override
	public void deleteById(Serializable id) {
		sampleDao.deleteById(id);
	}

	@Override
	public List<Sample> findAll() {
		return sampleDao.findAll();
	}

	@Override
	public Sample findById(Serializable id) {
		return sampleDao.findById(id);
	}

	@Override
	public List<Sample> search(Map<String, Object> parameterMap) {
		return sampleDao.search(parameterMap);
	}

}
