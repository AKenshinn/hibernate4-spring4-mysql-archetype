#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repositories.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ${package}.entities.Sample;
import ${package}.repositories.SampleDao;
import ${package}.repositories.base.HibernateDAOImpl;


@SuppressWarnings("unchecked")
@Repository(value = "sampleDao")
public class SampleDaoImpl extends HibernateDAOImpl<Sample, Serializable> implements SampleDao {

}
